package com.claudio.backendninja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.view.RedirectView;

import com.claudio.backendninja.model.Person;

@Controller
@RequestMapping("/example3")
public class Example3 {
	
	public static final String FORM_VIEW = "form";
	public static final String RESULT_VIEW = "result";
	
//	@GetMapping("/")
//	public String redirect(){
//		return "redirect:/example3/showform"; //poner el path url
//	}
	
	@GetMapping("/")
	public RedirectView redirect(){
		return new RedirectView("/example3/showform");
	}
	
	@GetMapping("/showform")
	public String showForm(Model model){
		model.addAttribute("person", new Person()); //(1)
		int i = 5/0; // FIXME error generado para mostrar error 500 internal server
		return FORM_VIEW;
		
	}
	
	@PostMapping("/addperson")
	// el nombre de la variable debe ser igual al nombre de (1)
	public ModelAndView addPerson(@ModelAttribute("person") Person person){ 
		ModelAndView mav = new ModelAndView(RESULT_VIEW);
		mav.addObject("person", person);
		return mav;
	}

}
