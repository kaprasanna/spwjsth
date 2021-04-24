package com.spwa;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DefaultController {
	
	@GetMapping(value = "/{path:[^\\.]*}")
	public String home() {
		return "index";
	}
	
	
	@GetMapping(value = "/settings.html")
	public String settings() {
		return "settings";
	}
}
