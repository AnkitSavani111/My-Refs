package com.tut;

import org.hibernate.SessionFactory;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.cfg.Configuration;
import org.hibernate.Transaction;

public class App {
    public static void main(String[] args) throws IOException{
        System.out.println("Project Started...");
        // Configuration cfg = new Configuration();
        // cfg.configure("hibernate.cfg.xml");
        // SessionFactory factory = cfg.buildSessionFactory();

        // SessionFactory is an interface which is thread safe and immutable and it is
        // responsible to create session objects
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory(); // hibernate.cfg.xml should be
                                                                                        // parallel to package else we
                                                                                        // have to specify the path

        // System.out.println(factory);

        // Creating Student Object
        Student st = new Student();
        st.setId(102);
        st.setName("Jay");
        st.setCity("Surat");
        System.out.println(st);

        // Creating Address Object
        Address ad = new Address();
        ad.setStreet("Street 1");
        ad.setCity("City 1");
        ad.setOpen(true);
        ad.setX(21648);
        ad.setAddedDate(new Date());
        // SETTING IMAGE
        // Usage of FileInputStream is to read the file as a stream of bytes
        FileInputStream fis = new FileInputStream("src/main/java/download.jpeg"); //throws IOException
        // Creating a byte array of size equal to the number of bytes of the file
        byte[] data = new byte[fis.available()];
        // Reading the data from the file and storing it in the array
        fis.read(data); 
        // Setting the data in the object
        ad.setImage(data); // byte[] data is the image data



        // Saving Object in Database

        // Create Session
        Session session = factory.openSession();

        // Begin Transaction
        Transaction tx = session.beginTransaction();

        // Save Object using persist method
        session.persist(st);
        session.persist(ad);

        // Commit Transaction
        tx.commit();

        // Close Session
        session.close();
        System.out.println("Done...");
    }
}
