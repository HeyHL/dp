package io.hel.bridge;

/**
 * author: hel
 * date: 2021/1/21 22:22
 * description:
 */
public class AdvancedRemoteController extends RemoteController{
    public AdvancedRemoteController(Device device) {
        super(device);
    }

    public void mute() {
        getDevice().setVolume(0);
    }
}
