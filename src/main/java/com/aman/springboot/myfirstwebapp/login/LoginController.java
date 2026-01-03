package com.aman.springboot.myfirstwebapp.login;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class LoginController {
	
	private AuthenticationService authenticationService;
	
	public LoginController(AuthenticationService authenticationService) {
		super();
		this.authenticationService = authenticationService;
	}
	@RequestMapping("login-old")
	public String gotoLoginPage(@RequestParam String name, ModelMap model) {
		System.out.println("Req param: " + name);
		model.put("namek", name);
		return "login";
	}
	@RequestMapping(value="login",method = RequestMethod.GET)
	public String goToLoginPage() {
		return "login";
	}
	
	@RequestMapping(value="login",method = RequestMethod.POST)
	public String goToWelcomePage(@RequestParam String name, @RequestParam String password, ModelMap model) {
		System.out.println("name param: " + name);
		System.out.println("passswwoordd param: " + password);
		model.put("name", name);
		//model.put("password", password);
		
		if (authenticationService.authenticate(name, password)) {
			return "welcome";
		}
		model.put("errorMessage", "Invalid Credentials!!");
		return "login";
		
	}
}
