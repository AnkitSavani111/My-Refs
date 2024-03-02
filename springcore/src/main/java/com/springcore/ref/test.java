package com.springcore.ref;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    public static void main(String[] args) {
        ApplicationContext context =  new ClassPathXmlApplicationContext("com/springcore/ref/refconfig.xml");
        test1 t1 = (test1) context.getBean("classtest1");
        System.out.println(t1.getTest1var());
        System.out.println(t1.getObjecttest2().getTest2var());
        try {
            ((ClassPathXmlApplicationContext)context).close();
        } catch (Exception e) {
            System.out.printf("Exception: %s\n", e.getMessage());
        }
    }
}
