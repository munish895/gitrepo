package com.mycart.mycart.service;

import com.mycart.mycart.model.Customer;
import com.mycart.mycart.model.User;

public interface CustomerService {

	
	void registerCustomer(Customer customer);
	User validateUsername(String username);
    Customer validateEmail(String email);
	Customer getCustomerByUsername(String username);
}
