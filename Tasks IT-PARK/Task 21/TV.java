package com.javarush.task.ITpark3.television;

public class TV {
    private String name;
    private final int MaxChannel = 5;
    private final int MaxProgram = 5;
    private Channel channel[];
    private Program program[];
    private int currentProgramCount;

    public TV(String name) {
        this.name = name;
        this.program = new Program[MaxChannel];
        this.currentProgramCount = 0;
    }

//    public void addProgram(Program program){
//        this.program[currentProgramCount] = program;
//        currentProgramCount++;
//    }
}
