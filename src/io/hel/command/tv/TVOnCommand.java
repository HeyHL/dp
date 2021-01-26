package io.hel.command.tv;

import io.hel.command.Command;

/**
 * author: hel
 * date: 2021/1/5 21:25
 * description:命令模式
 * 角色：具体命令角色
 * 描述：将请求委托给具体的接收者进行处理
 */
public class TVOnCommand implements Command {
    private TVReceiver tvReceiver;
    private String a;
    private String b;

    public TVOnCommand(TVReceiver tvReceiver, String a, String b) {
        this.a = a;
        this.b = b;
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.on(a, b);
    }

    @Override
    public void undo() {
        tvReceiver.off();
    }
}
