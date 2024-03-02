package com.spring.orm;

import com.spring.orm.dao.StudentDao;
import com.spring.orm.entities.Student;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("config.xml");
        StudentDao studentDao = context.getBean("studentDao", StudentDao.class);
        // Student student = new Student(122, "Ankit", "Surat");
        // int inserted = studentDao.insert(student);
        // System.out.println("Inserted: " + inserted);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        boolean go = true;
        while (go) {
            System.out.println("PRESS 1 FOR ADD NEW STUDENT");
            System.out.println("PRESS 2 FOR DISPLAY ALL STUDENTS");
            System.out.println("PRESS 3 FOR GET DETAIL OF SINGLE STUDENT");
            System.out.println("PRESS 4 FOR DELETE STUDENTS");
            System.out.println("PRESS 5 FOR UPDATE STUDENTS");
            System.out.println("PRESS 6 FOR EXIT");

            try {
                int input = Integer.parseInt(br.readLine());
                switch (input) {
                    case 1:
                        // Add new student
                        System.out.println("Enter user id:");
                        int userId = Integer.parseInt(br.readLine());
                        System.out.println("Enter user name:");
                        String userName = br.readLine();
                        System.out.println("Enter user city:");
                        String userCity = br.readLine();

                        Student student = new Student(userId, userName, userCity);

                        int inserted = studentDao.insert(student);
                        System.out.println(inserted + " student added");
                        System.out.println("-----------------------------------");
                        break;

                    case 2:
                        // Display all students
                        List<Student> students = studentDao.getAllStudents();
                        for (Student s : students) {
                            System.out.println("Id: " + s.getStudentId());
                            System.out.println("Name: " + s.getStudentName());
                            System.out.println("City: " + s.getStudentCity());
                            System.out.println("-----------------------------------");
                        }
                        break;

                    case 3:
                        // Get detail of single student
                        System.out.println("Enter student id:");
                        int studentId = Integer.parseInt(br.readLine());
                        Student student1 = studentDao.getStudent(studentId);
                        System.out.println("Id: " + student1.getStudentId());
                        System.out.println("Name: " + student1.getStudentName());
                        System.out.println("City: " + student1.getStudentCity());
                        System.out.println("-----------------------------------");
                        break;

                    case 4:
                        // Delete student
                        System.out.println("Enter student id:");
                        int studentId1 = Integer.parseInt(br.readLine());
                        studentDao.deleteStudent(studentId1);
                        break;

                    case 5:
                        // Update student
                        System.out.println("Enter student id:");
                        int studentId2 = Integer.parseInt(br.readLine());
                        System.out.println("Enter new name:");
                        String studentName = br.readLine();
                        System.out.println("Enter new city:");
                        String studentCity = br.readLine();
                        Student student2 = new Student(studentId2, studentName, studentCity);
                        studentDao.updateStudent(student2);

                        break;

                    case 6:
                        // Exit
                        go = false;
                        break;
                }

            } catch (Exception e) {
                System.out.println("Invalid input try with another one");
                System.out.println(e.getMessage());
            }


        }
        System.out.println("Thank you for using my application");
        System.out.println("See you soon");
    }
}
