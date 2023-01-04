package nuaa.edu.mybatis.binding;

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
    private Map<String,String> sqlSession;
    private final Class<T> mapperInterface;

    public MapperProxy(Map<String, String> sqlSession, Class<T> mapperInterface) {
        this.sqlSession = sqlSession;
        this.mapperInterface = mapperInterface;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        if (Object.class.equals(method.getDeclaringClass())){
            return method.invoke(this,args);
        }else {
            return "你被代理了" + sqlSession.get(mapperInterface.getName() +"." +  method.getName());
        }
    }
}
