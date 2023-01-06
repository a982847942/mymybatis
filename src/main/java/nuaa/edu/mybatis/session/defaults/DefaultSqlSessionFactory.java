package nuaa.edu.mybatis.session.defaults;

import nuaa.edu.mybatis.binding.MapperRegistry;
import nuaa.edu.mybatis.session.Configuration;
import nuaa.edu.mybatis.session.SqlSession;
import nuaa.edu.mybatis.session.SqlSessionFactory;

/**
 * @Classname DefaultSqlSessionFactory
 * @Description
 * @Date 2023/1/4 11:06
 * @Created by brain
 */
public class DefaultSqlSessionFactory implements SqlSessionFactory {
    //    private MapperRegistry mapperRegistry;


    //    public DefaultSqlSessionFactory(MapperRegistry mapperRegistry) {
//        this.mapperRegistry = mapperRegistry;
//    }
    private final Configuration configuration;

    public DefaultSqlSessionFactory(Configuration configuration) {
        this.configuration = configuration;
    }

    //    @Override
//    public SqlSession openSession() {
//        return new DefaultSqlSession(mapperRegistry);
//    }
    @Override
    public SqlSession openSession() {
        return new DefaultSqlSession(configuration);
    }
}
