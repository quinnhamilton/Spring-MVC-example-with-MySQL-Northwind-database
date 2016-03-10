package com.testSpring1.controller1;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testWelcome2 {

	@RequestMapping("/welcome2")
		public ModelAndView processWelcome(@RequestParam("name") String name){
		
			String [] ar = new String[2];
			
			ar[0] = "Hello";
			ar[1] = name;
			
			return new ModelAndView("welcome2", "dataArray", ar);
			
		
	}
}
