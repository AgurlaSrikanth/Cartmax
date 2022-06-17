package com.cartmax.ecom.controller;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.cartmax.ecom.User;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CartMaxController {

//	@Autowired
//	CartMaxService cartmaxService;

	@GetMapping({ "/", "/welcome" })
	public ModelAndView welcome() {
		System.out.println("welcome home");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.html");
		return modelAndView;	
	}

	@PostMapping("/login")
	public String login(@RequestBody User user) {
		System.out.println("login");
//		return cartmaxService.login(user);
		return "success";
	}

	@PostMapping("/registration")
	public String registration() {
		System.out.println("registration");
//		return cartmaxService.register(user);
		return "registration";
	}
}
