package com.job_finder.service;

import java.util.List;

import com.job_finder.helperClass.Company;
import com.job_finder.helperClass.LoginForm;
import com.job_finder.helperClass.RegistrationForm;
import com.job_finder.response.LoginMessage;

public interface AdminService {

	Boolean registerAdmin(RegistrationForm form);

	Boolean getOtp(String email, String otp);

	LoginMessage loginAdmin(LoginForm loginForm);

	String setPassword(String email, String password);

	List<Company> updateUserStatus(Long companyId, String newStatus);
}
