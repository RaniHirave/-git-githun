package com.sunbeaminfo.sh.bookshop.services;

import com.sunbeaminfo.sh.bookshop.pojos.Customer;

public interface LoginService {

	Customer validateLogin(String email, String password);

	void saveCustomer(Customer c);

}