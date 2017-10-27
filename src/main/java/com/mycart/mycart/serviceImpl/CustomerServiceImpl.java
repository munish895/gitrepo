package com.mycart.mycart.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mycart.mycart.Dao.CustomerDao;
import com.mycart.mycart.model.Customer;
import com.mycart.mycart.model.User;
import com.mycart.mycart.service.CustomerService;



@Service
@Transactional
public class CustomerServiceImpl implements CustomerService{

	@Autowired
	private CustomerDao customerDao;
	public void registerCustomer(Customer customer) {
		
		customerDao.registerCustomer(customer);
	}
	
	public User validateUsername(String username) {
		
		return customerDao.validateUsername(username);
	}
	
	
	public Customer validateEmail(String email) {
		
		return customerDao.validateEmail(email);
	}
	
	public Customer getCustomerByUsername(String username) {
		
		return customerDao.getCustomerByUsername(username);
	}

}
