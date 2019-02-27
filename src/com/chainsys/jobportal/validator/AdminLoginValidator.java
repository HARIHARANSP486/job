package com.chainsys.jobportal.validator;

import com.chainsys.jobportal.model.Admin;

public class AdminLoginValidator {
	public void loginValidator(Admin admin) throws Exception {
		if (admin.getPhoneNumber() == 10) {
			throw new Exception("Invalid Number");
		}
		

	}
	}
