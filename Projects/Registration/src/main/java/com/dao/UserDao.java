package com.dao;

import com.user.UserData;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

public class UserDao {
    SessionFactory sessionFactory = null;

    public UserDao(SessionFactory sf) {
        super();
        this.sessionFactory = sf;
    }

    public UserDao() {
        super();
    }

    public void saveUser(UserData userData) {
        Session session = sessionFactory.openSession();
        Transaction tx = session.beginTransaction();
        session.persist(userData);

        tx.commit();
        session.close();
    }

    public boolean validateUser(String username, String password) {
        Transaction tx = null;
        try{
            Session session = sessionFactory.openSession();
            tx = session.beginTransaction();
            UserData userData = session.createQuery("from UserData where uname = :username and upwd = :password", UserData.class)
                    .setParameter("username", username)
                    .setParameter("password", password)
                    .uniqueResult();
            if (userData != null) {
                return true;
            }
            tx.commit();
            session.close();
        }
        catch (Exception e){
            if (tx != null) {
                tx.rollback();

            }
            e.printStackTrace();
        }
        return false;
    }
}
