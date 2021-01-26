package io.hel.builder;

/**
 * author: hel
 * date: 2021/1/20 11:36
 * description:
 */
public class McDonaldsMealSeries {
    private float price;

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "McDonaldsMealSeries{" +
                "price=" + price +
                '}';
    }
}
