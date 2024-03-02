package com.hql;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

class HQLExample {
    public static void main(String[] args) {
        SessionFactory sf = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
        
        
        
        sf.close();
    }
}
