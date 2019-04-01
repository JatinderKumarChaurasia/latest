package com.cognizant.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.model.Login;
import com.cognizant.repository.LoginRepository;

@Service("loginService")
public class LoginServiceImpl implements LoginService{
	
	@Autowired
	LoginRepository loginRepository;
	
	/* (non-Javadoc)
	 * @see com.cognizant.services.LoginService#authenticate(com.cognizant.model.Login)
	 */
	/* (non-Javadoc)
	 * @see com.cognizant.services.LoginService#authenticate(com.cognizant.model.Login)
	 */
	/* (non-Javadoc)
	 * @see com.cognizant.services.LoginService#authenticate(com.cognizant.model.Login)
	 */
	@Override
	@Transactional
	public boolean authenticate(Login login){
		return loginRepository.authenticate(login);
	}

}