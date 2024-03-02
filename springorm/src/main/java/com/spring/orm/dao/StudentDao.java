package com.spring.orm.dao;

import com.spring.orm.entities.Student;
import org.springframework.orm.hibernate5.HibernateTemplate;

import javax.transaction.Transactional;
import java.util.List;

public class StudentDao {

    private HibernateTemplate hibernateTemplate;

    public StudentDao() {
    }

    public StudentDao(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }


//    Save the student object into the database
    @Transactional
    public int insert(Student student) {
        // Inserting data into the database
        Integer result = (Integer) this.hibernateTemplate.save(student);
        return result;
    }

//    Get the All student object from the database
    public List<Student> getAllStudents() {
        List<Student> students = this.hibernateTemplate.loadAll(Student.class);
        return students;
    }

//    Get the single student object from the database
    public Student getStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        return student;
    }

//    Delete the single student object from the database
    @Transactional
    public void deleteStudent(int studentId) {
        Student student = this.hibernateTemplate.get(Student.class, studentId);
        assert student != null;
        this.hibernateTemplate.delete(student);
    }

//    Update the single student object from the database
    @Transactional
    public void updateStudent(Student student) {
        this.hibernateTemplate.update(student);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
