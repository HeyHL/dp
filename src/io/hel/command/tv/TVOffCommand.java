package io.hel.command.tv;

import io.hel.command.Command;

/**
 * author: hel
 * date: 2021/1/5 21:28
 * description:
 */
public class TVOffCommand implements Command {
    private TVReceiver tvReceiver;

    public TVOffCommand(TVReceiver tvReceiver) {
        this.tvReceiver = tvReceiver;
    }

    @Override
    public void execute() {
        tvReceiver.off();
    }

    @Override
    public void undo() {
//        tvReceiver.on();
    }
}
