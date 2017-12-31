package com.claudio.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;


@Controller
@RequestMapping("/say")
public class HelloWorldController {
	
	@GetMapping("/helloworld")
	public String hellorWorld(){
		return "helloworld";
	}

}
