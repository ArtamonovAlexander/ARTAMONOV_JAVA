package com.company;

public interface List<T> {
    void addToBegin(T value); // добавление в начало
    void add(T value);        //добавление в конец
    T get(int index);
    void insert(T element, int index); // вставить по индексу со сдвигом
    void reverse();
    int getCount();
    boolean contains(T element); // возвращает true, если список содержит заданный элемент
    int indexOf(T element); // возвращает индекс элемента, если он есть в списке, -1 - если не нашел ничего
    void print(); // печать списка
}
