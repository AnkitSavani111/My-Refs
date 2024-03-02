package com.tut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmDemo {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        Student std1 = new Student();
        std1.setId(6544);
        std1.setName("Ankit Savani");
        std1.setCity("Surat");

        Certificate certi = new Certificate();
        certi.setCourse("Java");
        certi.setDuration("2 months");
        std1.setCerti(certi);

        Student std2 = new Student();
        std2.setId(531);
        std2.setName("God the Almighty");
        std2.setCity("Heaven");

        Certificate certi1 = new Certificate();
        certi1.setCourse("How to live");
        certi1.setDuration("Forever");
        std2.setCerti(certi1);


        Session session = sf.openSession();
        Transaction tx = session.beginTransaction();

        session.persist(std1);
        session.persist(std2);

        tx.commit();
        session.close();

        sf.close();
    }
}
