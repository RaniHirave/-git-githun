package com.sunbeaminfo.sh.bookshop.daos;

import com.sunbeaminfo.sh.bookshop.pojos.Customer;

public interface CustomerDao {

	Customer getCustomer(String email);

	int addCustomer(Customer c);

}