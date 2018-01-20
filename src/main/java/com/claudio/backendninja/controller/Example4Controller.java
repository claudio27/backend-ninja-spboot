package com.claudio.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/example4")
public class Example4Controller {
	
	@GetMapping("/vista")
	public String retornaVista(){
		return "404";
	}
	
	@GetMapping("/vista500")
	public String retornaVista500(){
		return "500";
	}

}
