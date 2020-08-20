package store.repositories.impl;

import org.hibernate.SessionFactory;
import store.entities.User;

public class UserRepositoryImpl {
    private SessionFactory sessionFactory;

    public Integer add(User user){
        return (Integer)sessionFactory.getCurrentSession().save(user);
    }

}
