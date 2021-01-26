package io.hel.bridge;

/**
 * author: hel
 * date: 2021/1/2 10:34
 * description:
 */
public class Client {
    public static void main(String[] args) {
        RemoteController remoteController = new RemoteController(new Radio());
        remoteController.togglePower();
        remoteController.channelUp();
        remoteController.volumeUp();
    }
}
