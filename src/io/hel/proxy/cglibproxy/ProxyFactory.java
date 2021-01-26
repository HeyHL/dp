package io.hel.proxy.cglibproxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;
import java.util.Arrays;

/**
 * author: hel
 * date: 2021/1/3 11:12
 * description:动态代理-Cglib代理
 * 角色：代理工厂
 * 描述：动态地生成代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    private Professor target;

    public ProxyFactory(Professor target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("Cglib proxy begin");
//        System.out.println(o);
//        System.out.println(method);
//        System.out.println(Arrays.toString(objects));
//        System.out.println(methodProxy);
        Object invokeResult = method.invoke(target, objects);
        System.out.println("Cglib proxy end");
        return invokeResult;
    }
}
