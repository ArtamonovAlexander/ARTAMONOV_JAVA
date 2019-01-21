package com.javarush.task.ITpark3.television;

public class RemoteController {
    private int index = 0;

    public void turningOffOn() {
        if (index == 0) {
            System.out.println("Включение телевизора");
            this.index++;
            return;
        } else if (index == 1) {
            System.out.println("Выключение телевизора");
            this.index = 0;
        }
    }
}
