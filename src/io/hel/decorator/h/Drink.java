package io.hel.decorator.h;

/**
 * author: hel
 * date: 2021/1/2 12:53
 * description:
 */
public abstract class Drink {
    private String description;
    private float price;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    protected abstract float cost();
}
