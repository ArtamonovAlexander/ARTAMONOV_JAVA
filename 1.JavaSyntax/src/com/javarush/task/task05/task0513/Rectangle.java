package com.javarush.task.task05.task0513;

/*
top, left, width, height
Собираем прямоугольник
*/

public class Rectangle {
    int top, left, width, height;

    public void initialize(int height, int top, int width, int left) {
        this.height = height;
        this.left = left;
        this.top = top;
        this.width = width;
    }
    public  void initialize(int top, int left){
        this.top = top;
        this.left = left;
    }

    public void initialize(int top, int left, int width) {
        this.top = top;
        this.left = left;
        this.width = width;
        this.height = width;
    }
    public void initialize(Rectangle rectangle) {
        this.top = rectangle.top;
        this.left = rectangle.left;
        this.width = rectangle.width;
        this.height = rectangle.height;
    }

    public static void main(String[] args) {

    }
}
