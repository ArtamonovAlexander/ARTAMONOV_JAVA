package com.javarush.task.ITpark3.television;

import java.util.Random;

public class Channel {
    private String name;
    private Program[] programs;
    private int count = 0;
    private int MAX_PROGRAM = 5;

    Random random = new Random();

    public Channel (String name){
        this.programs = new Program[MAX_PROGRAM];
    }

    public Channel(String name, Program[] programs) {
        this.name = name;
        this.programs = programs;
    }

    void show() {
        System.out.print("Канал " + name);
        programs[random.nextInt(count)].printName();
    }

    void addProgram(Program program) {
        this.programs[count] = program;
        count++;
    }
}
