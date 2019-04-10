package ru.home.repositiory;

import java.util.List;

public interface Crud<T> {
    void save(T t);
    T find(Long id);
    void delete(Long id);
    List<T> findAll();
}
