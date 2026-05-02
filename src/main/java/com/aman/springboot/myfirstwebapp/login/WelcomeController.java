package com.aman.springboot.myfirstwebapp.login;

import org.jspecify.annotations.Nullable;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.SessionAttributes;

@Controller
@SessionAttributes("name2") // It(name2) is the var put in modelmap for jsp, stored across sessions , name1 will not work
public class WelcomeController {

//	private AuthenticationService authenticationService;
//	public LoginController(AuthenticationService authenticationService) {
//		super();
//		this.authenticationService = authenticationService;
//	}
//
//	@RequestMapping("login-old")
//	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
//		System.out.println("Req param: " + name);
//		model.put("namek", name);
//		return "login";
//	}
//
//	@RequestMapping(value = "login", method = RequestMethod.GET)
//	public String goToLoginPage() {
//		return "login";
//	}
//
//	@RequestMapping(value = "login", method = RequestMethod.POST)
//	public String goToWelcomePage(@RequestParam String name1, @RequestParam String password, ModelMap model) {
//		System.out.println("name param: " + name1);
//		System.out.println("passswwoordd param: " + password);
//		model.put("name2", name1);
//		// {name2} key, {name1}value -> key for JSP
//		// model.put("password", password);
//
//		if (authenticationService.authenticate(name1, password)) {
//			return "welcome";
//		}
//		model.put("errorMessage", "Invalid Credentials!!");
//		// key, value -> key for JSP
//		return "login";
//	}
	@RequestMapping(value="/", method = RequestMethod.GET)
	public String gotoWelcomePage(ModelMap model) {
		System.out.println("USERNAME in WELKOME PaGEE:");
		System.out.println(getLoggedInUsername());
		
		model.put("name2", getLoggedInUsername());
		return "welcome";
	}
	
	private String getLoggedInUsername() {
		Authentication authentication = SecurityContextHolder.getContext().getAuthentication();
		return authentication.getName();
	}
	
}
