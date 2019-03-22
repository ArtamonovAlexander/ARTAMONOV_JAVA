package com.javarush.task.task14.task1408;

public class UkrainianHen extends Hen {
    int N = 3;
    String country = Country.UKRAINE;
    int getCountOfEggsPerMonth() {
        return N;
    }

    @Override
    String getDescription() {
        return (super.getDescription() + " Моя страна - " + country + ". Я несу " + N + " яиц в месяц.");
    }
}