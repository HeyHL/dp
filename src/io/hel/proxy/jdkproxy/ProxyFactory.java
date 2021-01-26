package io.hel.proxy.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * author: hel
 * date: 2021/1/3 10:37
 * description:动态代理-JDK代理
 * 角色：代理工厂
 * 描述：动态地生成代理对象
 */
public class ProxyFactory {
    private Teach target;

    public ProxyFactory(Teach target) {
        this.target = target;
    }

    public Object getProxyInstance() {
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), new InvocationHandler() {
            // 无论调用代理对象的哪一个方法，都是执行的invoke，该方法里实现了接口的增强
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                System.out.println("JDK proxy begin");
                // 调用被代理对象的方法
                Object invokeResult = method.invoke(target, args);
                System.out.println("JDK proxy end");
                return invokeResult;
            }
        });
    }

}
