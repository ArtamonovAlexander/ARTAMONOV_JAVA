package com.javarush.task.ITpark3.television;

public class RemoteController {
    private TV tv;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public void pressButton(int buttonNumber) {
        tv.showChannel(buttonNumber);
    }
}
