package com.cognizant.services;

import javax.transaction.Transactional;

import com.cognizant.model.Mechanic;

public interface MechanicService {

	/* (non-Javadoc)
	 * @see com.cognizant.services.MechanicService#save(com.cognizant.model.Mechanic)
	 */
	Mechanic save(Mechanic mechanic);

}