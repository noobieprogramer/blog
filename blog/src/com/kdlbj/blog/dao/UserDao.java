package com.kdlbj.blog.dao;

import com.kdlbj.blog.model.User;

/**
 * Created by kdlbj__ on 15/7/23.
 */
public interface UserDao {

    void save(User user);

    void update(User user);
}
