package com.javarush.task.ITpark3.television;


public class Main {
    public static void main(String[] args) {
        Program program1 = new Program("ОРТ");
        Program program2 = new Program("ОРТ2");
        Program program3 = new Program("ОРТ3");
        Program program4 = new Program("НТВ");
        Program program5 = new Program("НТВ2");
        Program program6 = new Program("НТВ3");
        Program program7 = new Program("РТР");
        Program program8 = new Program("РТР2");
        Program program9 = new Program("РТР3");

        Program[] programsOrt = {program1, program2, program3};
        Program[] programsNtv = {program4, program5, program6};
        Program[] programsRtr = {program7, program8, program9};

        Channel ort = new Channel("ORT", programsOrt);
        Channel ntv = new Channel("NTV", programsNtv);
        Channel rtr = new Channel("RTR", programsRtr);

        ort.addProgram(program1);
        ort.addProgram(program2);
        ort.addProgram(program3);
        ntv.addProgram(program4);
        ntv.addProgram(program5);
        ntv.addProgram(program6);
        rtr.addProgram(program7);
        rtr.addProgram(program8);
        rtr.addProgram(program9);

        TV samsung = new TV("Samsung");
        samsung.addChannel(ort);
        samsung.addChannel(ntv);
        samsung.addChannel(rtr);

        RemoteController rc = new RemoteController(samsung);
        rc.pressButton(0);
        rc.pressButton(1);
        rc.pressButton(2);
    }
}
