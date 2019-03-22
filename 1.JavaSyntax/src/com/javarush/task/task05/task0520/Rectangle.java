package com.javarush.task.task05.task0520;

/* 
Создать класс прямоугольник (Rectangle)
*/


public class Rectangle {
    int top;
    int left;
    int width;
    int height;

    public Rectangle(int left, int top, int width, int height){
        this.left = left;
        this.top = top;
        this.width = width;
        this.height = height;
    }
    public Rectangle(int left, int top){
        this.left = left;
        this.top = top;
        this.width = 0;
        this.height = 0;
    }
    public Rectangle(int width){
        this.width = width;
        this.height = width;
    }
    public Rectangle(Rectangle rectangle){
        this.left = rectangle.left;
        this.height = rectangle.height;
        this.width = rectangle.top;
        this.width = rectangle.width;
    }

    public static void main(String[] args) {

    }
}
