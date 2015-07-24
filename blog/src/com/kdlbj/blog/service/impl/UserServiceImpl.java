package com.kdlbj.blog.service.impl;

import com.kdlbj.blog.dao.UserDao;
import com.kdlbj.blog.model.User;
import com.kdlbj.blog.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by kdlbj__ on 15/7/23.
 */
@Service
public class UserServiceImpl implements UserService {

    @Autowired
    UserDao userDao;

    @Override
    public void save(User user) {
        userDao.save(user);
    }

    @Override
    public void update(User user) {

    }
}
