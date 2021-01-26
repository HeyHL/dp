package io.hel.adapter.defaultadapter;

/**
 * author: hel
 * date: 2021/1/1 15:16
 * description:
 */
public class Girls {
    public static void main(String[] args) {
        Adapter adapter = new Adapter() {
            @Override
            public void sleep() {
                System.out.println("girls sleep to kill time");
            }

            @Override
            public void shopping() {
                System.out.println("girls shopping pass the time");
            }

            @Override
            public void watchingTV() {
                System.out.println("girls watch TV to pass the time");
            }
        };

        adapter.sleep();
        adapter.shopping();
        adapter.watchingTV();
    }
}
