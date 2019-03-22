package com.javarush.task.task14.task1408;

public class MoldovanHen extends Hen {
    int N = 10;
    String country = Country.MOLDOVA;

    int getCountOfEggsPerMonth() {
        return N;
    }

    @Override
    String getDescription() {
        return (super.getDescription() + " Моя страна - " + country + ". Я несу " + N +" яиц в месяц.");
    }
}

