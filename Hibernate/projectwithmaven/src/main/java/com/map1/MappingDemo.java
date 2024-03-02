package com.map1;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class MappingDemo {
    public static void main(String[] args) {
        Configuration cfg = new Configuration();
        cfg.configure("hibernate.cfg.xml");
        SessionFactory sf = cfg.buildSessionFactory();

        Emp e1 = new Emp();
        Emp e2 = new Emp();

        e1.setEid(213);
        e2.setEid(543);

        e1.setName("Ram");
        e2.setName("Shyam");

        Project p1 = new Project();
        Project p2 = new Project();

        p1.setPid(101);
        p2.setPid(102);

        p1.setPname("Hibernate");
        p2.setPname("Spring");

        List<Emp> empList = new ArrayList<Emp>(); 
        List<Project> projectList = new ArrayList<Project>();

        empList.add(e1);
        empList.add(e2);
        projectList.add(p1);
        projectList.add(p2);

        e1.setProjects(projectList);
        p1.setEmps(empList);
        

        sf.close();
    }
}
