package io.hel.bridge;

/**
 * author: hel
 * date: 2021/1/21 22:12
 * description: 桥接模式
 * 角色：实现部分（后端部分）
 * 作用：声明基本的方法，这些方法为抽象部分提供支持
 */
public interface Device {
    boolean isEnabled();

    void enable();

    void disable();

    int getVolume();

    void setVolume(int percent);

    int getChannel();

    void setChannel(int channel);
}
