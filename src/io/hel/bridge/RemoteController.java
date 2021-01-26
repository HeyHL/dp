package io.hel.bridge;

/**
 * author: hel
 * date: 2021/1/21 22:18
 * description: 桥接模式
 * 角色：抽象部分（前端部分）
 * 作用：对外暴露功能接口
 */
public class RemoteController {
    private Device device;

    public RemoteController(Device device) {
        this.device = device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }

    public Device getDevice() {
        return device;
    }

    public void togglePower() {
        if (device.isEnabled())
            device.disable();
        else
            device.enable();
    }

    public void volumeDown() {
        device.setVolume(device.getVolume() - 1);
    }

    public void volumeUp() {
        device.setVolume(device.getVolume() + 1);
    }

    public void channelDown() {
        device.setChannel(device.getChannel() - 1);
    }

    public void channelUp() {
        device.setChannel(device.getChannel() + 1);
    }
}
