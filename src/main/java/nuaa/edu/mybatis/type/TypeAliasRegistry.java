package nuaa.edu.mybatis.type;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

/**
 * @Classname TypeAliasRegistry
 * @Description
 * @Date 2023/1/6 15:31
 * @Created by brain
 */
public class TypeAliasRegistry {
    private final Map<String, Class<?>> TYPE_ALIASES = new HashMap<>();

    public TypeAliasRegistry() {
        registerAlias("string",String.class);
        // 基本包装类型
        registerAlias("byte", Byte.class);
        registerAlias("long", Long.class);
        registerAlias("short", Short.class);
        registerAlias("int", Integer.class);
        registerAlias("integer", Integer.class);
        registerAlias("double", Double.class);
        registerAlias("float", Float.class);
        registerAlias("boolean", Boolean.class);
    }
    public void registerAlias(String alias,Class<?> value){
        String key =  alias.toLowerCase(Locale.ENGLISH);
        TYPE_ALIASES.put(key,value);
    }
    public <T> Class<T> resolveAlias(String alias){
        return (Class<T>)TYPE_ALIASES.get(alias.toLowerCase(Locale.ENGLISH));
    }
}
