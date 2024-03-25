package com.hardik.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MomController {
	
//	@ResponseBody
	@RequestMapping("/sugar")
	public String giveSugar() {
		return "/WEB-INF/view/sugar.jsp";
	}
	
	@ResponseBody
	@RequestMapping("/milk")
	public String giveMilk() {
		return "Here is your milk!!";
	}
	
}
