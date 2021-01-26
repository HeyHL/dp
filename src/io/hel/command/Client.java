package io.hel.command;

import io.hel.command.light.LightOffCommand;
import io.hel.command.light.LightOnCommand;
import io.hel.command.light.LightReceiver;
import io.hel.command.tv.TVOffCommand;
import io.hel.command.tv.TVOnCommand;
import io.hel.command.tv.TVReceiver;

/**
 * author: hel
 * date: 2021/1/5 21:19
 * description:
 */
public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController();

        LightReceiver lightReceiver = new LightReceiver();
        LightOnCommand lightOnCommand = new LightOnCommand(lightReceiver);
        LightOffCommand lightOffCommand = new LightOffCommand(lightReceiver);
        remoteController.setCommand(0, lightOnCommand, lightOffCommand);

        System.out.println("The light switch is turned on");
        remoteController.onButtonPushed(0);
        System.out.println("The light switch is turned off");
        remoteController.offButtonPushed(0);
        System.out.println("Undo the last operation");
        remoteController.undoButtonPushed();

        TVReceiver tvReceiver = new TVReceiver();
        TVOnCommand tvOnCommand = new TVOnCommand(tvReceiver, "tom", "jack");
        TVOffCommand tvOffCommand = new TVOffCommand(tvReceiver);
        remoteController.setCommand(1, tvOnCommand, tvOffCommand);

        System.out.println("Turn on the TV");
        remoteController.onButtonPushed(1);
        System.out.println("Turn off the TV");
        remoteController.offButtonPushed(1);
        System.out.println("Undo the last operation");
        remoteController.undoButtonPushed();
    }
}
