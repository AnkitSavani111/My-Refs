package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.io.IOException;

public class FetchDemo  {
    public static void main(String[] args) throws IOException {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();

        Session session = factory.openSession();
        Transaction tx = session.beginTransaction();
        Student std = (Student)session.get(Student.class, 101);;

        System.out.println(std);
        tx.commit();
        session.close();
        factory.close();
    }
}
