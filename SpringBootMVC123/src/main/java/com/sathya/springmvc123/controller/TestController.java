package com.sathya.springmvc123.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {
	@GetMapping("/display")
	public String display() {
		return "Webpage";
	}
	

}
