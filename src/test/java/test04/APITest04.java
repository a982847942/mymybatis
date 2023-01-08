package test04;

import com.alibaba.fastjson.JSON;
import nuaa.edu.mybatis.bulider.xml.XMLConfigBuilder;
import nuaa.edu.mybatis.io.Resources;
import nuaa.edu.mybatis.session.Configuration;
import nuaa.edu.mybatis.session.SqlSession;
import nuaa.edu.mybatis.session.SqlSessionFactory;
import nuaa.edu.mybatis.session.SqlSessionFactoryBuilder;
import nuaa.edu.mybatis.session.defaults.DefaultSqlSession;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test04.dao.IUserDao;
import test04.po.User;

import java.io.IOException;
import java.io.Reader;

/**
 * @Classname APITest
 * @Description
 * @Date 2023/1/6 17:50
 * @Created by brain
 */
public class APITest04 {
    private Logger logger = LoggerFactory.getLogger(APITest04.class);

    @Test
    public void test_SqlSessionFactory() throws IOException {
        // 1. 从SqlSessionFactory中获取SqlSession
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(Resources.getResourceAsReader("mybatis.xml"));
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 3. 测试验证
        User user = userDao.queryUserInfoById(1L);
        logger.info("测试结果：{}", JSON.toJSONString(user));
    }

    @Test
    public void test_selectOne() throws IOException {
        // 解析 XML
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        XMLConfigBuilder xmlConfigBuilder = new XMLConfigBuilder(reader);
        Configuration configuration = xmlConfigBuilder.parse();

        // 获取 DefaultSqlSession
        SqlSession sqlSession = new DefaultSqlSession(configuration);

        // 执行查询：默认是一个集合参数
        Object[] req = {1L};
        Object res = sqlSession.selectOne("test04.dao.IUserDao.queryUserInfoById", req);
        logger.info("测试结果：{}", JSON.toJSONString(res));
    }

}
