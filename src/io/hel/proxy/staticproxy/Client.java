package io.hel.proxy.staticproxy;

/**
 * author: hel
 * date: 2021/1/3 9:59
 * description:
 */
public class Client {
    public static void main(String[] args) {
        TeachingAssistant teachingAssistant = new TeachingAssistant(new Professor());
        teachingAssistant.teach();
    }
}
