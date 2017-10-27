package com.mycart.mycart.contoller;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.mycart.mycart.model.Customer;
import com.mycart.mycart.model.User;
import com.mycart.mycart.service.CustomerService;


@Controller
public class CustomerController {

	@Autowired
	private CustomerService customerService;
	
	@RequestMapping("/All/RegistrationForm")
	public String getRegistrationForm(Model model){
	
		model.addAttribute("customer",new Customer());
		return "registrationform";
	}
	
	
	@RequestMapping("/all/savecustomer")
	public String registerCustomer(@Valid @ModelAttribute Customer customer,BindingResult result, Model model){
		
		if(result.hasErrors())
		{
			return "RegistrationForm";
		}
		User user=customerService.validateUsername(customer.getUser().getUsername());
		if(user!=null){
			model.addAttribute("duplicateUsername","Username already exists");
			return "RegistrationForm";
		}
		Customer duplicateCustomer=customerService.validateEmail(customer.getEmail());
		if(duplicateCustomer!=null)
		{
			model.addAttribute("duplicateEmail","Email adress already exists");
			return "RegistrationForm";
		}
	
		customerService.registerCustomer(customer);
	    return "index";
	}
}

