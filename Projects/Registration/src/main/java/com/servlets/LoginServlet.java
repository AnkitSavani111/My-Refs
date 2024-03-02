package com.servlets;

import com.dao.UserDao;
import com.helper.FactoryProvider;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String susername = request.getParameter("username");
        String spassword = request.getParameter("password");
        UserDao dao = new UserDao(FactoryProvider.getFactory());
        HttpSession session = request.getSession();
        RequestDispatcher rd = null;
        if (dao.validateUser(susername, spassword)) {
            session.setAttribute("name",susername);
            rd = request.getRequestDispatcher("index.jsp");
        } else {
            request.setAttribute("status", "failed");
            rd = request.getRequestDispatcher("login.jsp");
        }
        rd.forward(request, response);
    }
}
