package com.cognizant.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.cognizant.model.Login;

@Repository("loginRepository")
public class LoginRepositoryImpl implements LoginRepository {

	@PersistenceContext
	EntityManager entityManager;

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.cognizant.repository.LoginRepository#authenticate(com.cognizant.model
	 * .Login)
	 */
	@Override
	public boolean authenticate(Login login) {
		

		long id = login.getUserId();
		String pass = login.getUserPassword();
		char type = login.getUserType();
		System.out.println("In User Id:" + id + " And Password is:" + pass);
		String que = "Select userId,userPassword from Login m where m.userId = " + id + " and m.userPassword = "+pass;
		// String password = login.getUserPassword();
		Query query = entityManager.createNativeQuery(que);
		if (query.getResultList().isEmpty()) {
			return false;
		} else {
			return true;
		}
	}

	
}