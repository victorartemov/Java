package com.ssu.victor_artemov.java.dao;

import java.util.List;

public interface DAO<T> {
    public List<T> findAll();
    public T findById(Long id);
    public void insert(T item);
    public void update(T item);
    public void delete(T item);
}
