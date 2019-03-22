package com.javarush.task.task15.task1530;

public class LatteMaker extends DrinkMaker {

    void takeCapForTea(){
        System.out.println("Берем чашку для латте");
    }
    void pourMilk(){
        System.out.println("Заливаем молоком с пенкой");
    }
    void makeCoffe(){
        System.out.println("Делаем кофе");
    }

    @Override
    void getRightCup() {
        System.out.println("Берем чашку для латте");
    }

    @Override
    void putIngredient() {
        System.out.println("Делаем кофе");
    }

    @Override
    void pour() {
        System.out.println("Заливаем молоком с пенкой");
    }

}
