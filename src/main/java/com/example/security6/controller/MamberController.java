package com.example.security6.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MamberController {
	
	@GetMapping("/")
	public String member() {
		return "member";
	}
}