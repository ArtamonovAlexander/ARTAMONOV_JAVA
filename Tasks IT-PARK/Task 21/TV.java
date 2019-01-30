package com.javarush.task.ITpark3.television;

public class TV {
    private Channel channels[];
    private int channelCount;
    private String name;

    public TV(String name) {
        this.name = name;
        this.channelCount = 0;
        this.channels = new Channel[5];
    }

    void addChannel(Channel channel){
        channels[channelCount] = channel;
        channelCount++;
    }


    public void showChannel(int channelNumber) {
        channels[channelNumber].show();
    }
}
