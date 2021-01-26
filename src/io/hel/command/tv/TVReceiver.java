package io.hel.command.tv;

/**
 * author: hel
 * date: 2021/1/5 21:26
 * description:命令模式
 * 角色：命令接收者
 * 描述：请求的真正处理者
 */
public class TVReceiver {
    public void on(String a, String b) {
        System.out.println(a + ": " + b);
        System.out.println("Turn on the TV to watch TV");
    }

    public void off() {
        System.out.println("Turn off the TV to rest");
    }
}
