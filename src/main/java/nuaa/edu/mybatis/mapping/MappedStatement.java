package nuaa.edu.mybatis.mapping;

import nuaa.edu.mybatis.session.Configuration;

import java.util.Map;

/**
 * @Classname MappedStatement
 * @Description
 * @Date 2023/1/4 20:47
 * @Created by brain
 */
public class MappedStatement {
    private Configuration configuration;
    private String id;
    private SqlCommandType sqlCommandType;
    private BoundSql boundSql;

//    private String parameterType;
//    private String resultType;
//    private String sql;
//    private Map<Integer, String> parameter;

    MappedStatement() {
        // constructor disabled
    }

    /**
     * 建造者
     */
    public static class Builder {

        private MappedStatement mappedStatement = new MappedStatement();

        public Builder(Configuration configuration, String id, SqlCommandType sqlCommandType, BoundSql boundSql) {
            mappedStatement.configuration = configuration;
            mappedStatement.id = id;
            mappedStatement.sqlCommandType = sqlCommandType;
//            mappedStatement.parameterType = parameterType;
//            mappedStatement.resultType = resultType;
//            mappedStatement.sql = sql;
//            mappedStatement.parameter = parameter;
            mappedStatement.boundSql = boundSql;
        }

        public MappedStatement build() {
            assert mappedStatement.configuration != null;
            assert mappedStatement.id != null;
            return mappedStatement;
        }

    }

    public Configuration getConfiguration() {
        return configuration;
    }

    public void setConfiguration(Configuration configuration) {
        this.configuration = configuration;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SqlCommandType getSqlCommandType() {
        return sqlCommandType;
    }

    public void setSqlCommandType(SqlCommandType sqlCommandType) {
        this.sqlCommandType = sqlCommandType;
    }

    public BoundSql getBoundSql() {
        return boundSql;
    }
//    public String getParameterType() {
//        return parameterType;
//    }
//
//    public void setParameterType(String parameterType) {
//        this.parameterType = parameterType;
//    }
//
//    public String getResultType() {
//        return resultType;
//    }
//
//    public void setResultType(String resultType) {
//        this.resultType = resultType;
//    }
//
//    public String getSql() {
//        return sql;
//    }
//
//    public void setSql(String sql) {
//        this.sql = sql;
//    }
//
//    public Map<Integer, String> getParameter() {
//        return parameter;
//    }
//
//    public void setParameter(Map<Integer, String> parameter) {
//        this.parameter = parameter;
//    }

}
