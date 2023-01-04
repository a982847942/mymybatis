package test01;

import nuaa.edu.mybatis.binding.MapperProxyFactory;
import org.apache.commons.logging.LogFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;

/**
 * @Classname APITest
 * @Description
 * @Date 2022/12/30 19:08
 * @Created by brain
 */
public class APITest {

    private static final Logger logger = LoggerFactory.getLogger(APITest.class);
    @Test
    public void test(){
        MapperProxyFactory<IUserDao> factory = new MapperProxyFactory<>(IUserDao.class);
        HashMap<String, String> sqlSession = new HashMap<>();
        sqlSession.put("test01.IUserDao.queryUserName","模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户姓名");
        sqlSession.put("test01.IUserDao.queryUserAge", "模拟执行 Mapper.xml 中 SQL 语句的操作：查询用户年龄");
        IUserDao userDao = factory.newInstance(sqlSession);
        String res = userDao.queryUserName("10001");
        logger.info("测试结果:{}",res);
    }

}
