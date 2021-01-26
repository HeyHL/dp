package io.hel.proxy.jdkproxy;

/**
 * author: hel
 * date: 2021/1/3 10:40
 * description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Professor());
        Teach proxyInstance = (Teach) proxyFactory.getProxyInstance();
        proxyInstance.sayHello("tom");
        proxyInstance.teach();
    }
}
