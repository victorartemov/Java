package com.ssu.victor_artemov.java.dao;

import com.ssu.victor_artemov.java.model.Story;
import java.util.List;

public interface StoryDao {
    public List<Story> findAll();
    public Story findById(Long id);
    public void insert(Story item);
    public void update(Story item);
    public void delete(Story item);
}
