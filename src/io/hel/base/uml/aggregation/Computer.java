package io.hel.base.uml.aggregation;

/**
 * author: hel
 * date: 2020/12/27 22:25
 * description:类与类之间的关系之聚合
 */
public class Computer {
    private Mouse mouse;
    private Monitor monitor;

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}
class Mouse{}
class Monitor{}