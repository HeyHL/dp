package io.hel.state;

/**
 * author: hel
 * date: 2021/1/10 11:04
 * description:
 */
public class Client {
    public static void main(String[] args) {
        Activity activity = new Activity(2);
        for (int i = 0; i < 100; i++) {
            System.out.printf("attempt No.%d\n", i + 1);
            activity.raffle();
        }
//        activity.
    }
}
