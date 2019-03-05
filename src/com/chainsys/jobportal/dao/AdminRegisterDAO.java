package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.jobportal.model.AdminRegistration;
import com.chainsys.jobportal.util.ConnectionUtil;

public class AdminRegisterDAO {
	public void addAdmin(AdminRegistration adminregistration)
	{
		try{
		Connection connection=ConnectionUtil.getConnection();
		String sql="insert into adminregistration(id,admin_id,admin_name,email_id,phone_number,password) values(adminregistration_id_seq.NEXTVAL,?,?,?,?,?)";
		
			PreparedStatement preparedStatement=connection.prepareStatement(sql);
			preparedStatement.setInt(1, adminregistration.getAdminId());
			preparedStatement.setString(2, adminregistration.getAdminName());
			preparedStatement.setString(3, adminregistration.getEmailId());
			preparedStatement.setLong(4, adminregistration.getPhoneNumber());
			preparedStatement.setString(5, adminregistration.getPassword());
			preparedStatement.executeQuery();
			ConnectionUtil.close(connection, preparedStatement, null);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
