package io.hel.decorator;

/**
 * author: hel
 * date: 2021/1/23 15:25
 * description:
 */
public class CompressionDecorator extends DataTranslateDecorator {
    private String format;
    private float compressionRatio;

    public CompressionDecorator(DataTranslate wrappee, String format, float compressionRatio) {
        super(wrappee);
        this.format = format;
        this.compressionRatio = compressionRatio;
    }

    @Override
    public void writeData() {
        encompression();
        System.out.println("compress successfully");
        super.writeData();
    }

    @Override
    public void readData() {
        super.readData();
        decompression();
        System.out.println("decompression successfully");
    }

    private void encompression() {
        System.out.printf("encompression format: %s\n", format);
        System.out.printf("encompression ratio: %f\n", compressionRatio);
    }

    private void decompression() {
        System.out.printf("decompression format: %s\n", format);
        System.out.printf("decompression ratio: %f\n", compressionRatio);
    }
}
