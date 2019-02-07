package com.company;

public class GenericLinkedList<T> implements List<T> {
    private Node top;
    private Node tail;
    private int count;
    private T elements[];

    public GenericLinkedList() {
        this.elements = (T[])new Object[10];
        this.top = null;
        this.count = 0;
    }

    private void swap(Node<T> i, Node<T> j) {
        T tmp;
        tmp = i.getValue();
        i.setValue(j.getValue());
        j.setValue(tmp);
    }

    private Node getNode(int index) {
        if (index > 0 && index < getCount()) {
            Node iNode = top;
            for (int i = 0; i < index - 1; i++) {
                iNode = iNode.getNext();
            }
            return iNode;
        } else return null;
    }

    public void print() {
        Node current = top;
        while (current != null) {
            System.out.print(current.getValue());
            current = current.getNext();
        }
        System.out.println();
    }

    @Override
    public void addToBegin(T value) {
        Node node = new Node(value);
        if (top == null) {
            tail = node;
        }
        node.setNext(top);
        count++;
        top = node;
    }

    @Override
    public void add(T value) {
        Node node = new Node(value);

        if (top == null) {
            top = node;
            tail = top;
        } else {
            tail.setNext(node);
            tail = node;
        }
        count++;
    }

    @Override
    public T get(int index) {
        if (index < getCount() && index > 0) {
            Node currentNode = top;
            for (int i = 0; i < index; i++) {
                currentNode = currentNode.getNext();
            }
            return (T) currentNode.getValue();
        }
        throw new IndexOutOfBoundsException();
    }

    @Override
    public void insert(T value, int index) {
        if (index < getCount() && index > 0) {
            Node node = new Node(value);
            Node current = top;
            for (int i = 0; i < index - 1; i++) {
                current = current.getNext();
            }
            node.setNext(current.getNext()); // у нас метод setNext только ссылки копирует, зачем добавляем .getNext ?
            current.setNext(node);    // ссылку current мы занесли в поле ссылки на node.
            count++;                  // Разве в 65 стр. мы не затерли её сыллкой current?
        } else System.err.println("не верный индекс");
    }

    @Override
    public void reverse() {
        Node toBegin = top;
        Node toEnd = tail;
        for (int i = 0; i < count / 2; i++) {
            swap(toBegin, toEnd);
            toBegin = toBegin.getNext();
            toEnd = getNode(count - i - 1);
        }
    }

    @Override
    public int getCount() {
        return count;
    }

    @Override
    public boolean contains(T element) {
        Node current = top;
        while (current != null) {
            if (current.getValue() == element) {
                return true;
            }
            current = current.getNext();
        }
        return false;
    }

    @Override
    public int indexOf(T element) {
        Node current = top;
        int i = 0;
        while (current != null) {
            if (current.getValue() == element) {
                return i;
            }
            i++;
            current = current.getNext();
        }
        return -1;
    }
}
