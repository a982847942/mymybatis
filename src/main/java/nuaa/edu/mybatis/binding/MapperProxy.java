package nuaa.edu.mybatis.binding;

import nuaa.edu.mybatis.session.SqlSession;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Map;

/**
 * @Classname MapperProxy
 * @Description
 * @Date 2022/12/30 19:13
 * @Created by brain
 */
public class MapperProxy<T> implements Serializable, InvocationHandler {
    private static final long serialVersionUID = -6424540398559729838L;
    //    private Map<String, String> sqlSession;
    private final Class<T> mapperInterface;
    private SqlSession sqlSession;
    private final Map<Method, MapperMethod> methodCache;

    //    public MapperProxy(Map<String, String> sqlSession, Class<T> mapperInterface) {
//        this.sqlSession = sqlSession;
//        this.mapperInterface = mapperInterface;
//    }
    public MapperProxy(SqlSession sqlSession, Class<T> mapperInterface,Map<Method, MapperMethod> methodCache) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
        this.methodCache = methodCache;
    }


    //    @Override
//    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
//        if (Object.class.equals(method.getDeclaringClass())) {
//            return method.invoke(this, args);
//        } else {
//            return "你被代理了" + sqlSession.get(mapperInterface.getName() + "." + method.getName());
//        }
//    }
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())) {
            return method.invoke(this, args);
        } else {
//            return sqlSession.selectOne(method.getName(), args);
            final MapperMethod mapperMethod = cachedMapperMethod(method);
            return mapperMethod.execute(sqlSession, args);
        }
    }
    /**
     * 去缓存中找MapperMethod
     */
    private MapperMethod cachedMapperMethod(Method method) {
        MapperMethod mapperMethod = methodCache.get(method);
        if (mapperMethod == null) {
            //找不到才去new
            mapperMethod = new MapperMethod(mapperInterface, method, sqlSession.getConfiguration());
            methodCache.put(method, mapperMethod);
        }
        return mapperMethod;
    }


}
