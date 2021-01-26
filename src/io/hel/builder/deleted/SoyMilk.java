package io.hel.builder.deleted;

/**
 * author: hel
 * date: 2021/1/19 22:31
 * description:
 */
public class SoyMilk {
    private long timeOfSoak;
    private long timeOlfGrind;
    private float price;

    public void setTimeOfSoak(long timeOfSoak) {
        this.timeOfSoak = timeOfSoak;
    }

    public void setTimeOlfGrind(long timeOlfGrind) {
        this.timeOlfGrind = timeOlfGrind;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "SoyMilk{" +
                "timeOfSoak=" + timeOfSoak +
                ", timeOlfGrind=" + timeOlfGrind +
                ", price=" + price +
                '}';
    }
}
