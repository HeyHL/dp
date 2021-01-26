package io.hel.command;

/**
 * author: hel
 * date: 2021/1/5 21:07
 * description:命令模式
 * 角色：命令发送者（调用者）
 * 描述：发送者触发命令， 而不向接收者直接发送请求。 注意， 发送者并不负责创建命令对象： 它通常会通过构造函数从客户端处获得预先生成的命令。
 */
public class RemoteController {
    private final int BUTTONS = 5;
    private final Command NONE_OPERATION = NullCommand.getInstance();
    private Command[] onCommands = new Command[BUTTONS];
    private Command[] offCommands = new Command[BUTTONS];
    private Command warmCommand;
    private Command coldCommand;
    private Command prevCommand;

    public RemoteController() {
        for (int i = 0; i < BUTTONS; i++) {
            onCommands[i] = NONE_OPERATION;
            offCommands[i] = NONE_OPERATION;
        }
    }

    public void setWarmCommand(Command warmCommand) {
        this.warmCommand = warmCommand;
    }

    public void setColdCommand(Command coldCommand) {
        this.coldCommand = coldCommand;
    }

    public void setCommand(int index, Command onCommand, Command offCommand) {
        onCommands[index] = onCommand;
        offCommands[index] = offCommand;
    }

    public void onButtonPushed(int index) {
        onCommands[index].execute();
        prevCommand = onCommands[index];
    }

    public void offButtonPushed(int index) {
        offCommands[index].execute();
        prevCommand = offCommands[index];
    }

    public void warmButtonPushed() {
        warmCommand.execute();
    }
    public void coldButtonPushed() {
        coldCommand.execute();
    }
    public void undoButtonPushed() {
        if (prevCommand == null)
            throw new RuntimeException();
        prevCommand.undo();
    }
}
