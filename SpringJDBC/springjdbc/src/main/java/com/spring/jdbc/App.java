package com.spring.jdbc;

import com.spring.jdbc.dao.JdbcConfig;
import com.spring.jdbc.dao.StudentDAO;
import com.spring.jdbc.entities.Student;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(JdbcConfig.class);
//        JdbcTemplate jdbcTemplate = context.getBean("jdbcTemplate", JdbcTemplate.class);
        StudentDAO studentDao = annotationConfigApplicationContext.getBean("studentDao", StudentDAO.class);
//        insert
//        jdbcTemplate.update(query, 1, "Raj", "Delhi");
//        Student student = new Student();
//        student.setId(2);
//        student.setCity("Delhi");
//        student.setName("Gaurav");
//
//        int result = studentDao.insert(student);
//        System.out.println("Student added: " + result);


//    update
//        Student student = new Student();
//        student.setId(2);
//        student.setCity("Surat");
//        student.setName("Ramesh");
//        int result = studentDao.change(student);
//        System.out.println("Student updated: " + result);

//        delete
//        int result = studentDao.delete(2);
//        System.out.println("Student deleted: " + result);


//        Student std = studentDao.getStudent(122);
//        System.out.println(std);

        List<Student> students = studentDao.getAllStudents();
        for (Student i : students) {
            System.out.println(i);
        }
    }
}
