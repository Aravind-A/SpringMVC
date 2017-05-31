package com.springmvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvc.model.Login;

@Controller
public class PostController {
	
	@RequestMapping(value = "/login")
	public String login(@ModelAttribute ("loginVarInForm") Login login){
		System.out.println(login.getUsername() + " " + login.getPassword());
		return "post";
	}

}
