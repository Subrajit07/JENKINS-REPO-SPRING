package com.lenka.restC;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebController {

	@GetMapping("/first")
	public String firstLink() {
		return "Jenkins first link";
	}
}
