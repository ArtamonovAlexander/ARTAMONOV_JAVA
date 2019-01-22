package com.javarush.task.ITpark3.television;

public class RemoteController {
    private TV tv;
    private int indexTurning = 0;

    public RemoteController(TV tv) {
        this.tv = tv;
    }

    public void pressButton(int buttonNumber) {
        tv.showChannel(buttonNumber);
    }

    public void turningOffOn() {
        if (indexTurning == 0) {
            System.out.println("Телевизор включен");
            this.indexTurning++;
        } else if (indexTurning == 1) {
            System.out.println("Телевизор выключен");
            this.indexTurning = 0;
        }
    }

}
