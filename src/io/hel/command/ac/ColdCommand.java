package io.hel.command.ac;

import io.hel.command.Command;

/**
 * author: hel
 * date: 2021/1/24 9:25
 * description:
 */
public class ColdCommand implements Command {
    private AirConditionerReceiver receiver;

    public ColdCommand(AirConditionerReceiver receiver) {
        this.receiver = receiver;
    }

    @Override
    public void execute() {
        receiver.cold();
    }

    @Override
    public void undo() {
        receiver.warm();
    }
}
