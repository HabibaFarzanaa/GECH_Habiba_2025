package com.springBoot.SpringSecurity.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SecurityController {
	@GetMapping({ "", "/" })
	public String home() {
		return "home";
	}

}
