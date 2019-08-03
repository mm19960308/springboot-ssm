package com.woniuxy.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("users")
public class UserController {
	
	@RequestMapping(method = RequestMethod.GET)
	@ResponseBody
	public String save() {
		
		System.out.println("UserController.save()");
		
		return null;
		
	
	}
	
}
