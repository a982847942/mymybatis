package test02;

import nuaa.edu.mybatis.binding.MapperRegistry;
import nuaa.edu.mybatis.session.SqlSession;
import nuaa.edu.mybatis.session.defaults.DefaultSqlSessionFactory;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import test01.APITest;
import test02.dao.IUserDao;

/**
 * @Classname test
 * @Description
 * @Date 2023/1/4 11:28
 * @Created by brain
 */
public class APITest02 {
    private static final Logger logger = LoggerFactory.getLogger(APITest02.class);
//    @Test
//    public void test_MapperProxyFactory(){
//        MapperRegistry registry = new MapperRegistry();
//        registry.addMappers("test02.dao");
//
//        DefaultSqlSessionFactory sqlSessionFactory = new DefaultSqlSessionFactory(registry);
//        SqlSession sqlSession = sqlSessionFactory.openSession();
//
//        IUserDao userDao = sqlSession.getMapper(IUserDao.class);
//
//        String res = userDao.queryUserName("10001");
//        logger.info("测试结果:{}",res);
//        logger.info("格式:{}",IUserDao.class);
//    }
}
