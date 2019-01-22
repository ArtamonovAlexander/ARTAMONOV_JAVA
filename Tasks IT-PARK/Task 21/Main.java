package com.javarush.task.ITpark3.television;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Channel ort = new Channel("ORT", new Program("Вести"), new Program("Намедни"));
        Channel ntn = new Channel("NTN", new Program("Камеди"), new Program("Даша"));

        TV samsung = new TV("Samsung", ort, ntn);

        RemoteController remote = new RemoteController(samsung);
        remote.turningOffOn();
        remote.pressButton(0);
        remote.pressButton(1);
        remote.turningOffOn();

    }
}
