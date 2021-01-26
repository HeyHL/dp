package io.hel.command;

/**
 * author: hel
 * date: 2021/1/5 21:02
 * description: 命令模式
 * 角色：命令角色
 * 描述：通常只包含一个execute方法
 */
public interface Command {
    void execute();

    void undo();
}
