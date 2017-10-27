package com.mycart.mycart.Dao;

import com.mycart.mycart.model.Customer;
import com.mycart.mycart.model.User;

public interface CustomerDao {

	void registerCustomer(Customer customer);
    User validateUsername(String username);
    Customer validateEmail(String email);
	Customer getCustomerByUsername(String username);
    
}

