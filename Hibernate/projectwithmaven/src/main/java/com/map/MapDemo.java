package com.map;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class MapDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory factory = cfg.buildSessionFactory();

        // Question 1
        Question q1 = new Question();
        q1.setQuestionId(1212);
        q1.setQuestion("What is Java?");

        // Answer 1
        Answer answer = new Answer();
        answer.setAnswerId(343);
        answer.setAnswer("Java is Programming language");
        answer.setQuestion(q1);

        // Answer 2
        Answer answer1 = new Answer();
        answer1.setAnswerId(344);
        answer1.setAnswer("Java has many frameworks");
        answer1.setQuestion(q1);

        // Answer 3
        Answer answer2 = new Answer();
        answer2.setAnswerId(345);
        answer2.setAnswer("Java used in many applications");
        answer2.setQuestion(q1);

        List<Answer> list = new ArrayList<Answer>();
        list.add(answer);
        list.add(answer1);
        list.add(answer2);

        q1.setAnswer(list);

        Session s = factory.openSession();
        Transaction tx = s.beginTransaction();
        
        s.persist(q1);
        s.persist(answer);
        s.persist(answer1);
        s.persist(answer2);
        

        tx.commit();
        s.close();
        factory.close();
    }
}
