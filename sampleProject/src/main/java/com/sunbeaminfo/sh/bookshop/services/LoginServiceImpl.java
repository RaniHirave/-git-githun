package com.sunbeaminfo.sh.bookshop.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sunbeaminfo.sh.bookshop.daos.CustomerDao;
import com.sunbeaminfo.sh.bookshop.pojos.Customer;

@Service
public class LoginServiceImpl implements LoginService {
	@Autowired
	private CustomerDao customerDao;

	@Transactional
	public Customer validateLogin(String email, String password) {
		Customer dbCust = customerDao.getCustomer(email);
		if(dbCust!=null && dbCust.getPassword().equals(password))
			return dbCust;
		return null;
	}
	
	@Transactional
	public void saveCustomer(Customer c) {
		customerDao.addCustomer(c);
	}
}
