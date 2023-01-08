package nuaa.edu.mybatis.mapping;

import java.util.Map;

/**
 * @Classname BoundSql
 * @Description
 * @Date 2023/1/6 17:36
 * @Created by brain
 */
public class BoundSql {
    private String sql;
    private Map<Integer,String> parameterMappings;
    private String parameterType;
    private String resultType;

    public BoundSql(String sql, Map<Integer, String> parameterMappings, String parameterType, String resultType) {
        this.sql = sql;
        this.parameterMappings = parameterMappings;
        this.parameterType = parameterType;
        this.resultType = resultType;
    }
    public String getSql() {
        return sql;
    }

    public Map<Integer, String> getParameterMappings() {
        return parameterMappings;
    }

    public String getParameterType() {
        return parameterType;
    }

    public String getResultType() {
        return resultType;
    }
}
