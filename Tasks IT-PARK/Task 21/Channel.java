package com.javarush.task.ITpark3.television;

import java.util.Random;
import java.util.concurrent.ThreadLocalRandom;

public class Channel {
    private String name;
    private Program[] programs;
    Random random;

    public Channel(String name, Program... programs) {
        this.name = name;
        this.programs = programs;
        random = new Random(programs.length);
    }

    void show() {
        programs[ThreadLocalRandom.current().nextInt(0, programs.length)].printName();
    }
}
