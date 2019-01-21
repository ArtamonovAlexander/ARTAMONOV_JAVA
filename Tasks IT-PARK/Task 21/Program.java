package com.javarush.task.ITpark3.television;

public class Program {
    private int numberProgram;
    private String nameChannel;

    public Program(int numberProgram, String nameChannel) {
        this.nameChannel = nameChannel;
        this.numberProgram = numberProgram;
    }

    public int getNumberProgram() {
        return numberProgram;
    }

    public String getNameChannel() {
        return nameChannel;
    }
}
