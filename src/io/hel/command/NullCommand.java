package io.hel.command;

/**
 * author: hel
 * date: 2021/1/5 21:09
 * description:
 */
public class NullCommand implements Command {

    private static NullCommand instance = new NullCommand();

    private NullCommand() {

    }

    public static NullCommand getInstance() {
        return instance;
    }

    @Override
    public void execute() {

    }

    @Override
    public void undo() {

    }
}
