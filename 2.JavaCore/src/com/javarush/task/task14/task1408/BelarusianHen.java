package com.javarush.task.task14.task1408;

public class BelarusianHen extends Hen {
    int N = 4;
    String country = Country.BELARUS;

    int getCountOfEggsPerMonth() {
        return N;
    }

    @Override
    String getDescription() {
        return (super.getDescription() + " Моя страна - " + country + ". Я несу " + N + " яиц в месяц.");
    }
}
