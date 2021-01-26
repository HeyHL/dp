package io.hel.proxy.cglibproxy;

/**
 * author: hel
 * date: 2021/1/3 11:16
 * description:
 */
public class Client {
    public static void main(String[] args) {
        ProxyFactory proxyFactory = new ProxyFactory(new Professor());
        Professor proxyInstance = (Professor)proxyFactory.getProxyInstance();
        proxyInstance.teach();
    }
}
