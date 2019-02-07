package com.company;

public class GenericArrayList<T> implements List<T>{
    private T elements[];
    private int count;

    public GenericArrayList() {
        this.elements = (T[])new Object[10];
        this.count = 0;
    }

    @Override
    public void addToBegin(T value) {
        for (int i = elements.length - 1; i > 0; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[0] = value;
    }
    @Override
    public void add(T value) {
        this.elements[count] = value;
        count++;
    }

    @Override
    public T get(int index) {
        if (index < count && index >= 0) {
            return elements[index];
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void insert(T element, int index) {
        for (int i = elements.length - 1; i > index; i--) {
            this.elements[i] = this.elements[i - 1];
        }
        this.elements[index] = element;
    }

    @Override
    public void reverse() {
        for (int i = 0; i < this.elements.length/2; i++) {
            T tmp = elements[i];
            elements[i] = elements[elements.length - 1 - i];
            elements[elements.length - 1 - i] = tmp;
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean contains(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) return true;
        }
        return false;
    }

    @Override
    public int indexOf(T element) {
        for (int i = 0; i < elements.length; i++) {
            if (element == elements[i]) return i;
        }
        return -1;
    }

    @Override
    public void print() {
        for (int i = 0; i < elements.length; i++) {
            System.out.print(this.elements[i] + " ");
        }
        System.out.println();
    }
}
