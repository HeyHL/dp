package io.hel.command.ac;

import io.hel.command.Command;

/**
 * author: hel
 * date: 2021/1/24 9:24
 * description:
 */
public class WarmCommand implements Command {
    private AirConditionerReceiver receiver;

    public WarmCommand(AirConditionerReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.warm();
    }

    @Override
    public void undo() {
        receiver.cold();
    }
}
