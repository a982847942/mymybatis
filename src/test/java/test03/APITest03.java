package test03;

import nuaa.edu.mybatis.io.Resources;
import nuaa.edu.mybatis.session.SqlSession;
import nuaa.edu.mybatis.session.SqlSessionFactory;
import nuaa.edu.mybatis.session.SqlSessionFactoryBuilder;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test03.dao.IUserDao;

import java.io.IOException;
import java.io.Reader;

/**
 * @Classname APITest03
 * @Description
 * @Date 2023/1/4 20:56
 * @Created by brain
 */
public class APITest03 {
    private final Logger logger = LoggerFactory.getLogger(APITest03.class);
    @Test
    public void test() throws IOException {
        // 1. 从SqlSessionFactory中获取SqlSession
        Reader reader = Resources.getResourceAsReader("mybatis.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(reader);
        SqlSession sqlSession = sqlSessionFactory.openSession();

        // 2. 获取映射器对象
        IUserDao userDao = sqlSession.getMapper(IUserDao.class);

        // 3. 测试验证
        String res = userDao.queryUserInfoById("10001");
        logger.info("测试结果：{}", res);

    }
}
