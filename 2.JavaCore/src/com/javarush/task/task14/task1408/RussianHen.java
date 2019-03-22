package com.javarush.task.task14.task1408;

public class RussianHen extends Hen {
    int N = 6;
    String country = Country.RUSSIA;
    int getCountOfEggsPerMonth() {
        return N;
    }

    @Override
    String getDescription() {
        return (super.getDescription() + " Моя страна - " + country + ". Я несу " + N + " яиц в месяц.");
    }
}
