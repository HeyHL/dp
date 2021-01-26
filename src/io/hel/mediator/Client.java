package io.hel.mediator;

/**
 * author: hel
 * date: 2021/1/9 18:08
 * description:
 */
public class Client {
    public static void main(String[] args) {
        /*
        1、闹钟提醒起床
        2、拉开窗帘
        3、煮咖啡
        4、看电视
         */
        ConcreteMediator mediator = new ConcreteMediator();
        Alarm alarm = new Alarm(mediator, "alarm");
        Curtains curtains = new Curtains(mediator, "curtains");
        alarm.getUp();
    }
}
