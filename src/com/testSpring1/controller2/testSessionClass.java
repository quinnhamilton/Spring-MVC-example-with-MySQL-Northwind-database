package com.testSpring1.controller2;

import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class testSessionClass {
	
	@RequestMapping("/welcome3")
	public ModelAndView keepSession(HttpSession session) {
		
		//always get attribute (cookie, appplication, session) first if null then set to zero
		if (session.getAttribute("counter")==null)
			session.setAttribute("counter", 0);
		
		//process the variable (increment counter c up on each visit)
		Integer c = (Integer) session.getAttribute("counter");
		c++;
		
		//set the variable, counter
		session.setAttribute("counter", c);
		
		//return the ModelAndView
		return new ModelAndView("welcome3", "sessionCounter",c);
		
	}

}
