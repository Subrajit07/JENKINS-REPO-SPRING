package com.security.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class RestWebController {

	public Double balace=85000.96d;
	
	@GetMapping("/home")
	public String home() {
		return "This is home Page";
	}
	
	@GetMapping("/balance")
	public String balance() {
		return "Current balance is "+balace;
	}
	
	@GetMapping("/contact")
	public String contact() {
		return "Welcome to contact support ! Do u have any query ! ";
	}
	
	@GetMapping("/withdraw/{price}")
	public String withdrawAmount(@PathVariable Double price) {
		if(balace<price) {
			return "Insufficent balance !";
		}else {
			balace-=price;
			return  price+" is debited successfully ! \nCurrent Balance is "+balace;
			
		}
	}
}
