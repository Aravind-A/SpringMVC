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
		//return "forward:fwdLogin.html";
		//or return "redirect:fwdLogin.html";  ---> closes the current request and starts a new request. The obtained info are not carried over.
	}
	
	//Forwarding example :
	/*******
	 * @RequestMapping(value = "/fwdLogin")
	public String fwdLogin(@ModelAttribute ("loginVarInForm") Login login){
		System.out.println(login.getUsername() + " in fwd route " + login.getPassword());
		return "post";
	}
	 *
	 */
}
