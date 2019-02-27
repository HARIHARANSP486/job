package com.chainsys.jobportal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.RegisterDAO;
import com.chainsys.jobportal.model.Register;


@WebServlet("/AddRegistrationServelt")
public class AddRegistrationServelt extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		Long phone = Long.parseLong(request.getParameter("phone"));
		String email = request.getParameter("email");
		String password = request.getParameter("password");
		String deptname = request.getParameter("deptname");		
		Integer experience=Integer.parseInt(request.getParameter("experience"));
		Register register=new Register();
		register.setName(name);
		register.setPhonenumber(phone);
		register.setEmail(email);
		register.setPassword(password);
		register.setDeptname(deptname);
		register.setExperience(experience);
		RegisterDAO registerDAO=new RegisterDAO();
		try
		{
			registerDAO.addUser(register);
			RequestDispatcher rd = request
					.getRequestDispatcher("login.html");
			rd.forward(request, response);
			
		}catch(Exception e)
		{
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
		
		
	}

}
