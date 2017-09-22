package com.mycart.mycart.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HomeController {
 @Autowired
	@RequestMapping("/")
	public String homePage()
	{
		return "index";
	}
 @RequestMapping("/home")
	public String home()
	{
		return "index";
	}
 @RequestMapping("/Login")
	public String Login(
	@RequestParam(value="error", required = false)
	String error,
	@RequestParam(value="logout", required = false)
	String logout,Model model) {
		System.out.println("inside login");
		if(error != null){
			model.addAttribute("error", "Invalid username and password");
			}

			if (logout !=null){
			model.addAttribute("msg", "You have been logged out successfully !!!!");
			}
	return "Login";
			
		}
}
