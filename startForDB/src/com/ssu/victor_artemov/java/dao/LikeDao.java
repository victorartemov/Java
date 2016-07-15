package com.ssu.victor_artemov.java.dao;

import com.ssu.victor_artemov.java.model.Like;

import java.util.List;

public interface LikeDao {
    public List<Like> findAll();
    public Like findById(Long id);
    public void insert(Like item);
    public void update(Like item);
    public void delete(Like item);
}
