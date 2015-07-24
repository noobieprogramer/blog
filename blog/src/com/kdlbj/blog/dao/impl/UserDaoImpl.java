package com.kdlbj.blog.dao.impl;

import com.kdlbj.blog.dao.UserDao;
import com.kdlbj.blog.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Created by kdlbj__ on 15/7/23.
 */
@Component
public class UserDaoImpl implements UserDao {

    @Autowired
    SessionFactory sessionFactory;

    @Override
    public void save(User user) {

        Session session = sessionFactory.openSession();
        Transaction ts = session.beginTransaction();
        System.out.println(sessionFactory);
        session.save(user);
        ts.commit();
        System.out.println("save user");
    }

    @Override
    public void update(User user) {

    }
}
