package com.ssu.victor_artemov.java.dao;

import com.ssu.victor_artemov.java.model.User;
import java.util.List;

public interface UserDao {
    public List<User> findAll();
    public User findById(Long id);
    public void insert(User item);
    public void update(User item);
    public void delete(User item);
}
