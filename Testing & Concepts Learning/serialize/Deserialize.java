package serialize;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class Deserialize {
    public static void main(String[] args) {
        try {
            FileInputStream fileInputStream = new FileInputStream("./serialize/student.txt");

            ObjectInputStream objectInputStream = new ObjectInputStream(fileInputStream);

            Student student = (Student) objectInputStream.readObject();

            System.out.println(student);

        } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}
