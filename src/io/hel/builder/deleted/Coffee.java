package io.hel.builder.deleted;

/**
 * author: hel
 * date: 2021/1/19 22:38
 * description:
 */
public class Coffee {
    private long timeOfSoak;
    private long timeOfGrind;
    private String type;

    public void setTimeOfSoak(long timeOfSoak) {
        this.timeOfSoak = timeOfSoak;
    }

    public void setTimeOfGrind(long timeOfGrind) {
        this.timeOfGrind = timeOfGrind;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Coffee{" +
                "timeOfSoak=" + timeOfSoak +
                ", timeOfGrind=" + timeOfGrind +
                ", type='" + type + '\'' +
                '}';
    }
}
