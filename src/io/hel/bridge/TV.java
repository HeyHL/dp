package io.hel.bridge;

/**
 * author: hel
 * date: 2021/1/21 22:16
 * description:
 */
public class TV implements Device {
    private boolean enable;
    private int volume;
    private int channel;

    @Override
    public boolean isEnabled() {
        return enable;
    }

    @Override
    public void enable() {
        enable = true;
    }

    @Override
    public void disable() {
        enable = false;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int percent) {
        volume = percent;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        this.channel = channel;
    }
}
