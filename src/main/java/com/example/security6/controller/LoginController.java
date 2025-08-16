package com.example.security6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.security6.form.LoginForm;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	@GetMapping
	public String showLogin(@ModelAttribute LoginForm form) {
		// templates 디렉터리의 login.html 반환
		return "login";
	}
}