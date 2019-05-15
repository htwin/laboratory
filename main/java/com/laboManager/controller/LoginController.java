package com.laboManager.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/login")
public class LoginController {
	
	
	@RequestMapping("/name")
	@ResponseBody
	private Map<String,String> showLoginName(){
		
		String name = SecurityContextHolder.getContext().getAuthentication().getName();
		
		Map<String, String> map = new HashMap<String, String>();
		
		map.put("loginName",name);
		
		return map;
	}
	
	
}
