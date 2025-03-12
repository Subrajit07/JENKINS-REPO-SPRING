package com.lenka.restC;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

	@GetMapping("/first")
	public String firstLink() {
		return "Jenkins first link";
	}
}
