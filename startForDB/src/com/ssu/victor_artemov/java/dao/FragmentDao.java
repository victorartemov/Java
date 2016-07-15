package com.ssu.victor_artemov.java.dao;

import com.ssu.victor_artemov.java.model.Fragment;
import java.util.List;

public interface FragmentDao {
    public List<Fragment> findAll();
    public Fragment findById(Long id);
    public void insert(Fragment item);
    public void update(Fragment item);
    public void delete(Fragment item);
}
