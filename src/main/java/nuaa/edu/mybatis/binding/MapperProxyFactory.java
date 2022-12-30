package nuaa.edu.mybatis.binding;

import java.io.Serializable;
import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @Classname MapperProxyFactory
 * @Description
 * @Date 2022/12/30 19:14
 * @Created by brain
 */
public class MapperProxyFactory implements InvocationHandler, Serializable {
    
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return null;
    }
}
