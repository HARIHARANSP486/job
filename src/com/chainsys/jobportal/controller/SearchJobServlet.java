package com.chainsys.jobportal.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.chainsys.jobportal.dao.SearchJobDAO;
import com.chainsys.jobportal.model.Admin;


@WebServlet("/SearchJobServlet")
public class SearchJobServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
   
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String deptName = request.getParameter("deptname");
		System.out.println(deptName);
		SearchJobDAO searchjobDAO=new SearchJobDAO();
		Admin admin=new Admin();
		//admin.setVacancyDept(deptName);
		try
		{
			Admin search=searchjobDAO.searchJob(deptName);
			
			request.setAttribute("JOB",search);
			RequestDispatcher rd = request.getRequestDispatcher("list.jsp");
			rd.forward(request,response);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		
		
	
	}

}
