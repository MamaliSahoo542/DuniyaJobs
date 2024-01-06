package com.job_finder.service;

import java.util.List;
import java.util.Optional;

import com.job_finder.entity.UserDtls;
import com.job_finder.helperClass.EducationData;
import com.job_finder.helperClass.Employment;
import com.job_finder.helperClass.LoginForm;
import com.job_finder.helperClass.RegistrationForm;
import com.job_finder.helperClass.UpdateProfile;
import com.job_finder.response.LoginMessage;
import com.job_finder.response.ProfileData;
import com.job_finder.response.UserProfileList;

public interface UserService {
	List<UserDtls> getAllUsers();

	Optional<UserDtls> getUserById(Long userId);

	boolean createUser(UserDtls user);

	UserDtls updateUser(Long userId, UserDtls updatedUser);

	void deleteUser(Long userId);

	Optional<UserDtls> getUserDetailsById(Long userId);

	Boolean addEmployee(RegistrationForm form);

	LoginMessage loginEmployee(LoginForm loginForm);

	String saveEmploymentData(Employment employmentData);

//   EducationService 

	void saveEducationDetails(EducationData educationDetails);

//   profile data
	ProfileData getUserProfile(Long userId);

	UpdateProfile getProfileById(Long profileId);

	String updateProfile(Long profileId, UpdateProfile updateProfile);

	Boolean getOtp(String email, String otp);

	String setPassword(String email, String password);
	

	List<UserProfileList> getUserProfileList(int page, int size);


}
