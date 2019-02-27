package com.chainsys.jobportal.dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.chainsys.jobportal.model.Register;
import com.chainsys.jobportal.util.ConnectionUtil;

public class RegisterDAO {
	
	public void addUser(Register register) throws Exception{
		try
	{
		Connection connection = ConnectionUtil.getConnection();
		String sql="insert into register(name,phone_number,email,password,dept_name,experience) values(?,?,?,?,?,?)";
		PreparedStatement preparedstatement = connection
				.prepareStatement(sql);
		preparedstatement.setString(1, register.getName());
		preparedstatement.setLong(1, register.getPhonenumber());
		preparedstatement.setString(1, register.getEmail());
		preparedstatement.setString(1, register.getPassword());
		preparedstatement.setString(1, register.getDeptname());
		preparedstatement.setInt(1, register.getExperience());
		preparedstatement.executeUpdate();
		ConnectionUtil.close(connection, preparedstatement, null);
	}
	catch(SQLException e)
		{
		e.printStackTrace();
		}

}
	public Register checkLogin(Register register) {
		Register registration = null;
		try {
			Connection connection = ConnectionUtil.getConnection();
			String sql = "select phone_number,password from register where phone_number=? and password=?";
			PreparedStatement preparedstatement = connection
					.prepareStatement(sql);
			long phone = register.getPhonenumber();
			preparedstatement.setLong(1, phone);
			preparedstatement.setString(2, register.getPassword());
			preparedstatement.executeUpdate();
			ConnectionUtil.close(connection, preparedstatement, null);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return registration;
	}
}
