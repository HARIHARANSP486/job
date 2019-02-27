package com.chainsys.jobportal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.AdminDAO;
import com.chainsys.jobportal.model.Admin;
import com.chainsys.jobportal.validator.AdminLoginValidator;


@WebServlet("/AdminLoginServlet")
public class AdminLoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		long phone = Long.parseLong(request.getParameter("phone"));
		String password = request.getParameter("password");
		Admin admin=new Admin();
		admin.setPhoneNumber(phone);
		System.out.println(admin.getPhoneNumber());
		System.out.println(password);
		AdminDAO adminDAO=new AdminDAO();
		try {
			AdminLoginValidator validator=new AdminLoginValidator();
			validator.loginValidator(admin);
			//adminDAO.checkLogin(admin);
			RequestDispatcher req = request.getRequestDispatcher("admin.jsp");
			req.forward(request, response);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher req = request.getRequestDispatcher("adminlogin.html");
			req.forward(request, response);
		}
		
	
	
	}

}
