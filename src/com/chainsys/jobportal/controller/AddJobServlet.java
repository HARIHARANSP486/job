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


@WebServlet("/AddJobServelt")
public class AddJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//Integer id =Integer.parseInt( request.getParameter("id"));
		Integer adminId=Integer.parseInt(request.getParameter("adminId"));
		String adminName=request.getParameter("adminName");
		String vacancyDept=request.getParameter("vacancyDept");
		String vacancyDetails=request.getParameter("vacancyDetails");
		String jobLocation=request.getParameter("jobLocation");
		String companyName=request.getParameter("companyName");
		Long phoneNumber=Long.parseLong(request.getParameter("phoneNumber"));
		Admin admin = new Admin();
		//admin.setId(id);
		admin.setAdminId(adminId);
		admin.setAdminName(adminName);
		admin.setVacancyDept(vacancyDept);
		admin.setVacancyDetails(vacancyDetails);
		admin.setJobLocation(jobLocation);
		admin.setCompanyName(companyName);
		admin.setPhoneNumber(phoneNumber);
		AdminDAO adminDAO=new AdminDAO();
		try {
			adminDAO.addDetails(admin);
			RequestDispatcher rd = request.getRequestDispatcher("success.html");
			rd.forward(request, response);

			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			RequestDispatcher rd = request.getRequestDispatcher("failure.html");
			rd.forward(request, response);
		}
	
	
	
	}

}
