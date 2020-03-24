package com.app.dao;

import com.app.model.User;
import org.hibernate.Hibernate;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate3.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDAOImpl implements UserDAO
{

    @Autowired
    private SessionFactory sessionFactory;
    public void setSessionFactory(SessionFactory sessionFactory)
    {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void save(User user)
    {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(user);
        tx.commit();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<User> getAll()
    {
        Session session = this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        List<User> personList = session.createQuery("from User").list();
        return personList;
    }

    public void deleteUser(User user)
    {
        Session session=this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.delete(user);
        tx.commit();
    }

    public void updateUser(User user)
    {
        Session session=this.sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.update(user);
        tx.commit();
    }

}
