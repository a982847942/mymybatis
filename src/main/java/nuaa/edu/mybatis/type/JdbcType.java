package nuaa.edu.mybatis.type;

import java.sql.Types;
import java.util.HashMap;
import java.util.Map;

/**
 * @Classname JdbcType
 * @Description
 * @Date 2023/1/6 15:42
 * @Created by brain
 */
public enum JdbcType {
    INTEGER(Types.INTEGER),
    FLOAT(Types.FLOAT),
    DOUBLE(Types.DOUBLE),
    DECIMAL(Types.DECIMAL),
    VARCHAR(Types.VARCHAR),
    TIMESTAMP(Types.TIMESTAMP);
    private static Map<Integer,JdbcType> codeLookup = new HashMap<>();

    static {
        for (JdbcType type : JdbcType.values()) {
            codeLookup.put(type.TYPE_CODE,type);
        }
    }

    public final int TYPE_CODE;
    JdbcType(int code) {
        TYPE_CODE = code;
    }
}
