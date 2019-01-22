package com.javarush.task.ITpark3.television;

public class TV {
    private Channel channels[];
    private String name;


    public TV(String name, Channel... channels) {
        this.name = name;
        this.channels = channels;
    }

    public void showChannel(int channelNumber) {
        channels[channelNumber].show();
    }
}
