package serialize;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

/**
 * Serialize
 */
public class SerializeTheStudent {

    public static void main(String[] args) {
        Student student = new Student("Ankit Savani", "Surat");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("./serialize/student.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);
            objectOutputStream.writeObject(student);
            objectOutputStream.close();
            fileOutputStream.close();
            System.out.println("Student object is serialized");
        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

    // FileOutputStream fileOutputStream = new FileOutputStream("student.txt");
    // File
}