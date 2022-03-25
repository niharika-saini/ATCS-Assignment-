package com.demo1;

import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.HttpServletBean;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmailController  {
	
	@RequestMapping("/email")
	public ModelAndView add(HttpRequest request, HttpServletBean response) {

		ModelAndView mv = new ModelAndView();

		mv.setViewName("index.jsp");
		

		return mv;
	}


}
