package com.company.repositories;

public interface CrudRepository<T> {
    void save(T model);
    T find(Long id);
}