package com.javarush.task.task08.task0820;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* 
Множество всех животных
*/

public class Solution {
    static Dog dog1 = new Dog();
    static Dog dog2 = new Dog();
    static Dog dog3 = new Dog();

    static Cat cat1 = new Cat();
    static Cat cat2 = new Cat();
    static Cat cat3 = new Cat();
    static Cat cat4 = new Cat();

    static class Cat{
        Cat(){}
    }

    static class Dog{
        Dog(){}
    }

    public static void main(String[] args) {
        Set<Cat> cats = createCats();
        Set<Dog> dogs = createDogs();

        Set<Object> pets = join(cats, dogs);
        printPets(pets);

        removeCats(pets, cats);
        printPets(pets);
    }

    public static Set<Cat> createCats() {
        HashSet<Cat> cats = new HashSet<>();
        cats.add(cat1);
        cats.add(cat2);
        cats.add(cat3);
        cats.add(cat4);
        //напишите тут ваш код

        return cats;
    }

    public static Set<Dog> createDogs() {
        HashSet<Dog> dogs = new HashSet<>();
        dogs.add(dog1);
        dogs.add(dog2);
        dogs.add(dog3);
        //напишите тут ваш код
        return dogs;
    }

    public static Set<Object> join(Set<Cat> cats, Set<Dog> dogs) {
        HashSet<Object> join = new HashSet<>();
        join.addAll(cats);
        join.addAll(dogs);
        //напишите тут ваш код
        return join;
    }

    public static void removeCats(Set<Object> pets, Set<Cat> cats) {
        pets.removeAll(cats);
        //напишите тут ваш код
    }

    public static void printPets(Set<Object> pets) {
        for (Object c : pets) {
            System.out.println(c);
        }
    }

    //напишите тут ваш код
}
