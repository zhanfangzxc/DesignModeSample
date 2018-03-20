package com.zss.ordermode;

public class Stereo {
    private int volume;

    public void on() {
        System.out.println("Stereo is on");
    }

    public void off() {
        System.out.println("Stereo is off");
    }

    public void setCD() {
        System.out.println("Stereo is set CD");
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
