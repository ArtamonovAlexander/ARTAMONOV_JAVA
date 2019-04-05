package ru.home.repositiory;

public interface Crud<T> {
    void save(T t);
    T find(Long id);
    void delete(Long id);
}
