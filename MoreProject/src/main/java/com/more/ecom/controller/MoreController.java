package com.more.ecom.controller;

import org.apache.tomcat.jni.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class MoreController {

//	@Autowired
//	CartMaxService cartmaxService;

	@RequestMapping("/login")
	public ModelAndView welcome() {
		System.out.println("welcome home");
		ModelAndView modelAndView = new ModelAndView();
		modelAndView.setViewName("login_form.html");
		return modelAndView;
	}

	@GetMapping("")
	public String viewHomePage() {
		return "index";
	}

//@GetMapping("/login")
	public String showLoginForm(Model model) {
		model.addAttribute("user", new User());
		System.out.println("calling login page");
		return "login_form";
	}

	//@GetMapping("/process_login")
	public String login(@RequestBody User user) {
		System.out.println("calling process_login ");
//		return cartmaxService.login(user);
		return "success";
	}

	@GetMapping("/register")
	public String showRegistrationForm(Model model) {
		model.addAttribute("user", new User());
		System.out.println("calling register page");
		return "signup_form.html";
	}

	@PostMapping("/process_register")
	public String processRegister(User user) {

//	    userRepo.save(user);
		System.out.println("calling process register page");
		return "register_success";
	}


//@GetMapping("/login")
public ModelAndView welcome1() {
	System.out.println("welcome home");
	ModelAndView modelAndView = new ModelAndView();
	modelAndView.setViewName("login_form.html");
	return modelAndView;
}
}


