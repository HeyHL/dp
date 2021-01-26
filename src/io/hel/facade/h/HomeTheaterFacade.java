package io.hel.facade.h;

/**
 * author: hel
 * date: 2021/1/2 16:41
 * description:
 */
public class HomeTheaterFacade {
    private DVDPlayer dvdPlayer = DVDPlayer.getInstance();
    private Popcorn popcorn = Popcorn.getInstance();
    private Projector projector = Projector.getInstance();
    private Screen screen = Screen.getInstance();
    private Stereo stereo = Stereo.getInstance();
    private Light light = Light.getInstance();

    public void ready() {
        popcorn.on();
        popcorn.pop();
        projector.on();
        screen.down();
        dvdPlayer.on();
        stereo.on();
    }

    public void play() {
        dvdPlayer.play();
        light.dim();
        stereo.up();
    }

    public void pause() {
        dvdPlayer.pause();
        light.bright();
    }

    public void end() {
        light.bright();
        stereo.down();
        screen.up();
        projector.off();
        popcorn.off();
        dvdPlayer.off();
    }
}
