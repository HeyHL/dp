package io.hel.decorator;

/**
 * author: hel
 * date: 2021/1/23 15:19
 * description:
 */
public class FileDataTranslate implements DataTranslate {
    private String filename;

    public FileDataTranslate(String filename) {
        this.filename = filename;
    }

    public void setFilename(String filename) {
        this.filename = filename;
    }

    @Override
    public void writeData() {
        System.out.printf("write data to %s\n", filename);
    }

    @Override
    public void readData() {
        System.out.printf("read data from %s\n", filename);
    }
}
