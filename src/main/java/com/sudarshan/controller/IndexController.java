package com.sudarshan.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class IndexController {
	
	@RequestMapping("/index")
	public String showIndex() {
		//return "/WEB-INF/jsps/index.jsp";
		return "index";
	}
}
