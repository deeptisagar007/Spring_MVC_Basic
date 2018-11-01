package com.deepti.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller()
public class Add {
	
	@RequestMapping("/add")
	public ModelAndView addNums(@RequestParam("name") String name, @RequestParam("id") int id, @RequestParam("pass") String pass ) {
		
		
		System.out.println("In Add");
		System.out.println(name);
		System.out.println(id);
		System.out.println(pass);

		customer cust = new customer();
		cust.setcId(id);
		cust.setcName(name);
		cust.setcPass(pass);
		
		
		
		
		
		
		ModelAndView mv = new ModelAndView();
		
		mv.addObject("name", name);
		mv.addObject("id", id);
		mv.addObject("pass", pass);
		mv.setViewName("display2.jsp");
		mv.setViewName("display.jsp");
		return mv;
	}
	
}
