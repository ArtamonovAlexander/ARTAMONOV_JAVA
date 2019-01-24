package com.javarush.task.ITpark3.television;

import java.util.Random;

public class Channel {
    private String name;
    private Program[] programs;
    Random random;

    public Channel(String name, Program... programs) {
        this.name = name;
        this.programs = programs;
        random = new Random();
    }

    void show() {
        programs[random.nextInt(programs.length)].printName();
    }
}
