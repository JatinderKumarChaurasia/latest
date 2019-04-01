package com.cognizant.repository;

import com.cognizant.model.Login;

public interface LoginRepository {

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cognizant.repository.LoginRepository#authenticate(com.cognizant.model
	 * .Login)
	 */
	boolean authenticate(Login login);

}