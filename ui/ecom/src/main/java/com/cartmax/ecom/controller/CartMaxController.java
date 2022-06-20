package com.cartmax.ecom.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cartmax.ecom.model.User;
import com.cartmax.ecom.service.CartMaxService;

@RestController
public class CartMaxController {
	
	@Autowired
	CartMaxService cartmaxService;

	@GetMapping({ "/", "/welcome" })
	public String welcome() {
		System.out.println("welcome home");
		return "login";
	}
	
	@GetMapping("/login")
	public String login(@RequestBody User user) {
		System.out.println("login");
		return cartmaxService.login(user);
	}
	
	@PostMapping("/registration")
	public String registration(@RequestBody User user ) {
		System.out.println("registration");
		return cartmaxService.register(user);
	}
}
