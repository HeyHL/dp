package io.hel.facade;

/**
 * author: hel
 * date: 2021/1/23 17:12
 * description:
 */
public class Client {
    public static void main(String[] args) {
        VideoConverterFacade videoConverter = new VideoConverterFacade();
        VideoFile mp4File = videoConverter.convert("a.ogg", "mp4");
        System.out.println(mp4File);
    }
}
