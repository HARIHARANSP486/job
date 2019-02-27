package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.jobportal.model.Admin;
import com.chainsys.jobportal.model.Register;
import com.chainsys.jobportal.util.ConnectionUtil;

public class AdminDAO {
	public void addDetails(Admin admin) throws Exception{
		try
	{
		Connection connection = ConnectionUtil.getConnection();
		String sql="insert into admin(id,admin_id,admin_name,vacancy_dept,vacancy_details,job_location,company_name,phone_no) values(admin_idno_seq.NEXTVAL,?,?,?,?,?,?,?)";
		PreparedStatement preparedstatement = connection
				.prepareStatement(sql);
		preparedstatement.setInt(1, admin.getAdminId());
		preparedstatement.setString(2, admin.getAdminName());
		preparedstatement.setString(3, admin.getVacancyDept());
		preparedstatement.setString(4, admin.getVacancyDetails());
		preparedstatement.setString(5, admin.getJobLocation());
		preparedstatement.setString(6, admin.getCompanyName());
		preparedstatement.setLong(7,admin.getPhoneNumber());
		preparedstatement.executeUpdate();
		ConnectionUtil.close(connection, preparedstatement, null);
	}
	catch(SQLException e)
		{
		e.printStackTrace();
		}
	}
	public Admin checkLogin(Admin admin) {
		Admin administration= null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select phone_no from admin where phone_no=?";
			PreparedStatement preparedstatement = connection
					.prepareStatement(sql);
			long phone = admin.getPhoneNumber();
			preparedstatement.setLong(1, phone);
			preparedstatement.executeUpdate();
			ConnectionUtil.close(connection, preparedstatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return administration;
	}


}
