package com.simpleSpringBoot.FirstWebApp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@Controller
public class Homecontroller {
	@GetMapping({"","/"})
	public String home() {
		return "home";
	}

}