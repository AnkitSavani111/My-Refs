package com.springcore.autowired;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("com/springcore/autowired/autoconfig.xml");
        Emp emp1 =  context.getBean("emp", Emp.class);

        System.out.println(emp1);
    }
}
