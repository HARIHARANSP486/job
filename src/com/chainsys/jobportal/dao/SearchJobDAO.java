package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.chainsys.jobportal.model.Admin;
import com.chainsys.jobportal.util.ConnectionUtil;

public class SearchJobDAO {
	public Admin searchJob(String deptName) throws SQLException
	{
		
	
			Connection connection = ConnectionUtil.getConnection();
			String sql="select vacancy_dept,vacancy_details,job_location,company_name from admin where vacancy_dept=?";
			PreparedStatement preparedStatement = connection
					.prepareStatement(sql);
			preparedStatement.setString(1, deptName);
			ResultSet resultset = preparedStatement.executeQuery();
			Admin admin=null;
			if (resultset.next()) {
				admin=new Admin();
				admin.setVacancyDept(resultset.getString("vacancy_dept"));
				admin.setVacancyDetails(resultset.getString("vacancy_details"));
				admin.setJobLocation(resultset.getString("job_location"));
				admin.setCompanyName(resultset.getString("company_name"));
				
			}
			else
			{
				System.out.println("DEPTNAME ERROR");
			}
			return admin;
			
	}
		
		
	
}
