package com.spring.jdbc.dao;

import com.spring.jdbc.entities.Student;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

public class StudentDAOImpl implements StudentDAO {
    private JdbcTemplate jdbcTemplate;

    public int insert(Student student) {
        String query = "insert into student(id, name, city) values(?,?,?)";
        int update = this.jdbcTemplate.update(query, student.getId(), student.getName(), student.getCity());

        return update;
    }

    @Override
    public int change(Student student) {
//        Update
        String query = "update student set name=?, city=? where id=?";
        int update = this.jdbcTemplate.update(query, student.getName(), student.getCity(), student.getId());
        return update;
    }

    @Override
    public int delete(int studentId) {
//        Delete
        String query = "delete from student where id=?";
        int update = this.jdbcTemplate.update(query, studentId);
        return update;
    }

    @Override
    public Student getStudent(int studentId) {
        //      Select single student
        String query = "select * from student where id=?";
        RowMapperImpl rowMapper = new RowMapperImpl();
        Student student = this.jdbcTemplate.queryForObject(query, rowMapper, studentId);
        return student;
    }

    @Override
    public List<Student> getAllStudents() {
//        Select multiple students
        String query = "select * from student";
        List<Student> students = this.jdbcTemplate.query(query, new RowMapperImpl());
        return students;
    }

    public JdbcTemplate getJdbcTemplate() {
        return jdbcTemplate;
    }

    public void setJdbcTemplate(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }
}
