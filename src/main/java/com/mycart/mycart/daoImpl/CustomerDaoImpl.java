package com.mycart.mycart.daoImpl;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Repository;

import com.mycart.mycart.Dao.CustomerDao;
import com.mycart.mycart.model.Admin;
import com.mycart.mycart.model.Cart;
import com.mycart.mycart.model.Customer;
import com.mycart.mycart.model.User;


@Repository
public class CustomerDaoImpl implements CustomerDao {

	@Autowired
	private SessionFactory sessionFactory;
	
	public void registerCustomer(Customer customer) 
	{
		User user=customer.getUser();
		user.setEnabled(true);
		String username=customer.getUser().getUsername();
		customer.setUsername(username);
		Admin admin=new Admin();
		admin.setRole("ROLE_USER");
		admin.setUsername(username);
		Session session=sessionFactory.openSession();
		session.save(admin);
		
		Cart cart=new Cart();
		cart.setCustomer(customer);
		customer.setCart(cart);
		session.save(customer);
		session.flush();
		session.close();
	}

	public User validateUsername(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from User where username=?");
		query.setString(0, username);
		User user=(User)query.uniqueResult();
		return user;
		
	}

	public Customer validateEmail(String email) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer where email=?");
		query.setString(0, email);
		Customer customer=(Customer)query.uniqueResult();
		return customer;
	}
	

	public Customer getCustomerByUsername(String username) {
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer where username=?");
		query.setString(0,username);
		Customer customer=(Customer)query.uniqueResult();
		return customer;
	}
	

}
