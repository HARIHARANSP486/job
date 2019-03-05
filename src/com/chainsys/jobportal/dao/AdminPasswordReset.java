package com.chainsys.jobportal.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;

import oracle.jdbc.proxy.annotation.Pre;

import com.chainsys.jobportal.model.AdminRegistration;
import com.chainsys.jobportal.util.ConnectionUtil;

public class AdminPasswordReset{
	public void  changePasswordAdmin(AdminRegistration adminregistration)
	{
		try
		{
		Connection connection=ConnectionUtil.getConnection();
		String sql="update adminregistration set phone_number=?,password=? where phone_number=?";
		PreparedStatement preparedStatement=connection.prepareStatement(sql);
		preparedStatement.setLong(1, adminregistration.getPhoneNumber());
		preparedStatement.setString(2, adminregistration.getPassword());
		preparedStatement.setLong(3,adminregistration.getPhoneNumber());
		preparedStatement.executeQuery();
		ConnectionUtil.close(connection, preparedStatement, null);
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	}
}
