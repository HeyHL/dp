package io.hel.decorator;

/**
 * author: hel
 * date: 2021/1/23 15:20
 * description:
 */
public class DataTranslateDecorator implements DataTranslate {
    private DataTranslate wrappee;

    public DataTranslateDecorator(DataTranslate wrappee) {
        this.wrappee = wrappee;
    }

    public void setWrappee(DataTranslate wrappee) {
        this.wrappee = wrappee;
    }

    @Override
    public void writeData() {
        this.wrappee.writeData();
    }

    @Override
    public void readData() {
        wrappee.readData();
    }
}
