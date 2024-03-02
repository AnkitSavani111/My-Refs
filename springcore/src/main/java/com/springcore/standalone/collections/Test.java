package com.springcore.standalone.collections;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
                "com/springcore/standalone/collections/aloneconfig.xml");
        Person person1 = context.getBean("person1", Person.class);
        System.out.println(person1);
        System.out.println(person1.getFriends().getClass().getName());
//        System.out.printf(person1);
        System.out.println(person1.getFeeStructure().getClass().getName());
    }
}
