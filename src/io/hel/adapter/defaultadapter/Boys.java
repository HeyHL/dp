package io.hel.adapter.defaultadapter;

/**
 * author: hel
 * date: 2021/1/1 15:14
 * description:
 */
public class Boys {
    public static void main(String[] args) {
        Adapter adapter = new Adapter() {
            // 对需要用到的方法进行选择性地重写
            @Override
            public void sleep() {
                System.out.println("boys sleep to kill time");
            }

            @Override
            public void playBasketball() {
                System.out.println("boys playing basketball to kill time");
            }
        };
        adapter.sleep();
        adapter.playBasketball();
    }
}
