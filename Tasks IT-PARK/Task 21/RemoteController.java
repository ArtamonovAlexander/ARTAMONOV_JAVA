package com.javarush.task.ITpark3.television;

public class RemoteController {
    private int index = 0;

    public void turningOffOn() {
        if (index == 0) {
            System.out.println("��������� ����������");
            this.index++;
            return;
        } else if (index == 1) {
            System.out.println("���������� ����������");
            this.index = 0;
        }
    }
}
