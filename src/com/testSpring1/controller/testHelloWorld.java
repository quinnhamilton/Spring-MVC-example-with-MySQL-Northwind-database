package com.testSpring1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testHelloWorld {
	
	@RequestMapping("/welcome")
	public ModelAndView helloWorld () {
		
		return new ModelAndView("welcome", "message", "Hello World"); //if the request is for "welcome", response with message "Hello World"v
				
	}
}
