package com.javarush.task.task05.task0522;

/* 
Максимум конструкторов
*/

public class Circle {
    public double x;
    public double y;
    public double radius;

    public Circle (double x , double y , double radius){
        this.x = x;
        this.y = y;
        this.radius = radius;
    }
    public Circle(double x, double y){
        this.x = x;
        this.y = y;
        this.radius = 10;
    }
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle (){};

    public Circle (Circle copy){
        this.x = copy.x;
        this.y = copy.y;
        this.radius = copy.radius;
    }

    public static void main(String[] args) {

    }
}