package com.demo.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.demo.web.Model.People;
import com.demo.web.dao.PeopleDao;

public class GetPeopleController extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("pid"));
		PeopleDao dao = new PeopleDao();
		People pip = dao.getPeople(id);
		
		
		HttpSession session = request.getSession();
		
		session.setAttribute("people", pip);
		response.sendRedirect("showPeople.jsp");
		
//		RequestDispatcher rd = request.getRequestDispatcher("showPeople.jsp");
//		rd.forward(request, response);
	}

}
