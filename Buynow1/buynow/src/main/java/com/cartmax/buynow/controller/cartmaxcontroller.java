package com.cartmax.buynow.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.cartmax.buynow.service.MoreService;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class CartmaxController {

	@Autowired
	MoreService moreService;

	@GetMapping("")
	public String viewHomePage1() {
		return "Login";
	}

	@GetMapping("/Home")
	public String Home() {
		return "home";
	}

	@GetMapping("/categories")
	public String listCategories() {
		return "Categories";
	}

	@GetMapping("/mens")
	public String listmens() {
		return "mens";
	}

	@GetMapping("/womens")
	public String listwomens() {
		return "womens";
	}

	@GetMapping("/kids")
	public String listkids() {
		return "kids";
	}

	@GetMapping("/cosmetics")
	public String listcosmetics() {
		return "cosmetics";
	}

	@GetMapping("/slipper")
	public String listslipper() {
		return "slipper";
	}

	@GetMapping("/payment")
	public String listpayment() {
		return "payment";
	}

	@GetMapping("/delivery")
	public String listdelivery() {
		return "delivery";
	}

	@GetMapping("/cart")
	public String listcart() {
		return "cart";
	}

	@GetMapping("/contact")
	public String listcontact() {
		return "contact";
	}

	@GetMapping("/Aboutus")
	public String listAboutus() {
		return "aboutus";
	}

	@GetMapping("/terms")
	public String listterms() {
		return "terms";
	}

	@GetMapping("/order")
	public String listorder() {
		return "order";
	}

	@GetMapping("/admin")
	public String listadmin() {
		return "admin";
	}

	@GetMapping("/signupnow")
	public String listsignupnow() {
		return "signupnow";
	}

	@GetMapping("/resetpswd")
	public String listresetpswd() {
		return "resetpswd";
	}

	@GetMapping("/signin")
	public String showLoginPage() {
		return "signin";

	}

	@GetMapping("/about")
	public String listAbout() {
		return "about";

	}

	@GetMapping("/index")
	public String index() {
		return "index";

	}

	@GetMapping("/checkout")
	public String checkout() {
		return "checkout";
	}

	@GetMapping("/products")
	public String products() {
		return "products";
	}

	@RequestMapping("/register")
	public String register() {
		// register logic
		return "register";
	}

	@RequestMapping("/login")
	public ModelAndView welcome() {
		System.out.println("welcome home");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login.html");
		return modelAndView;
	}

	// @GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("user", new org.apache.tomcat.jni.User());
		System.out.println("calling login page");
		return "login_form";
	}

	// @GetMapping("/process_login")
	public String login(@RequestBody org.apache.catalina.User user) {
		System.out.println("calling process_login ");
//			return cartmaxService.login(user);
		return "success";
	}

	/*
	 * @GetMapping("/register") public String showRegistrationForm(Model model) {
	 * model.addAttribute("user", new org.apache.tomcat.jni.User());
	 * System.out.println("calling register page"); return "signup_form.html"; }
	 */

	@PostMapping("/process_register")
	public String processRegister(org.apache.catalina.User user) {

//		    userRepo.save(user);
		System.out.println("calling process register page");
		return "register_success";
	}

	// @GetMapping("/login")
	public ModelAndView welcome1() {
		System.out.println("welcome home");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login_form.html");
		return modelAndView;
	}

}
