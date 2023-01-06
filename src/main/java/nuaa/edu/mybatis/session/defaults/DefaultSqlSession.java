package nuaa.edu.mybatis.session.defaults;

import nuaa.edu.mybatis.binding.MapperRegistry;
import nuaa.edu.mybatis.mapping.MappedStatement;
import nuaa.edu.mybatis.session.Configuration;
import nuaa.edu.mybatis.session.SqlSession;

/**
 * @Classname DefaultSqlSession
 * @Description
 * @Date 2023/1/4 11:06
 * @Created by brain
 */
public class DefaultSqlSession implements SqlSession {
//
//    /**
//     * 映射器注册机
//     */
//    private MapperRegistry mapperRegistry;
//
//    public DefaultSqlSession(MapperRegistry mapperRegistry) {
//        this.mapperRegistry = mapperRegistry;
//    }
//
//    @Override
//    public <T> T selectOne(String statement) {
//        return (T) ("你被代理了！" + statement);
//    }
//
//    @Override
//    public <T> T selectOne(String statement, Object parameter) {
//        return (T) ("你被代理了！" + "方法：" + statement + " 入参：" + parameter);
//    }
//
//    @Override
//    public <T> T getMapper(Class<T> type) {
//        return mapperRegistry.getMapper(type, this);
//    }

    private Configuration configuration;

    public DefaultSqlSession(Configuration configuration) {
        this.configuration = configuration;
    }

    @Override
    public <T> T selectOne(String statement) {
        return (T) ("你被代理了！" + statement);
    }

    @Override
    public <T> T selectOne(String statement, Object parameter) {
        MappedStatement mappedStatement = configuration.getMappedStatement(statement);
        return (T) ("你被代理了！" + "\n方法：" + statement + "\n入参：" + parameter + "\n待执行SQL：" + mappedStatement.getSql());
    }

    @Override
    public <T> T getMapper(Class<T> type) {
        return configuration.getMapper(type, this);
    }

    @Override
    public Configuration getConfiguration() {
        return configuration;
    }

}
