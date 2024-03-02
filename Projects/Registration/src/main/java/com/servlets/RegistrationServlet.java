package com.servlets;

import com.dao.UserDao;
import com.helper.FactoryProvider;
import com.user.UserData;
import org.hibernate.Session;
import org.hibernate.Transaction;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.io.IOException;

public class RegistrationServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, NullPointerException, IOException {

        String sname = request.getParameter("name");
        String semail = request.getParameter("email");
        String spass = request.getParameter("pass");
        String scontact = request.getParameter("contact");

        Session s = FactoryProvider.getFactory().openSession();
        Transaction tx = s.beginTransaction();

        UserData data = new UserData(sname, semail, spass, scontact);
        UserDao dao = new UserDao(FactoryProvider.getFactory());
        dao.saveUser(data);

        request.setAttribute("status", "success");
        RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
        rd.forward(request, response);


//        request.setAttribute("status", "success");
//        s.persist(data);
//        tx.commit();
//        s.close();
//        RequestDispatcher rd = request.getRequestDispatcher("registration.jsp");
//        rd.forward(request, response);
    }
}
