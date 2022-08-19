package com.technogadgets.ph.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {

	
	@GetMapping("/index")
	public String index() {
		return "index";
	}
	
	
	
	@GetMapping("/service")
	public String service() {
		return "service";
	}
	
	
	@GetMapping("/products")
	public String product() {
		return "products";
	}
	
	
	@GetMapping("/about")
	public String about() {
		return "about";
	}
	
	
	@GetMapping("/contact")
	public String contact() {
		return "contact";
	}
	
}
