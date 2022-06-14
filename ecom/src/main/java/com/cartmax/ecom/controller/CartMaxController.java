package com.cartmax.ecom.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class CartMaxController {

	@GetMapping({ "/", "/welcome" })
	public String welcome() {
		System.out.println("login");
		return "login.html";
	}
	@GetMapping("/registration")
	public String registration() {
		System.out.println("registration");
		return "registration.html";
	}
}
