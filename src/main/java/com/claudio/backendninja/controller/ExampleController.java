package com.claudio.backendninja.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.claudio.backendninja.model.Person;

@Controller
@RequestMapping("/example")
public class ExampleController {
	
	
	private static final String EXAMPLE_VIEW = "example";
	
	
	//Primera Forma
	//@RequestMapping(value="exampleString", method=RequestMethod.GET)
	@GetMapping("exampleString")
	public String exampleString(Model model){
		
		// Pasar un dato simple a traves del controlador
//		model.addAttribute("name", "Claudio"); 
		// Pasar un dato simple complejo del controlador
		model.addAttribute("person", new Person("Claudio", 30));
		
		//Pasar una lista de elementos
		model.addAttribute("people", getPeople());
		
		return EXAMPLE_VIEW;
	}
	
	//Segunda Forma
	@RequestMapping(value="exampleMAV", method=RequestMethod.GET)
	public ModelAndView exampleMAV(){
		ModelAndView mav = new ModelAndView(EXAMPLE_VIEW);
		
		//mav.addObject("name", "Anita");
				
		mav.addObject("person", new Person("Anita", 30));
		
		mav.addObject("people", getPeople());
		//return new ModelAndView(EXAMPLE_VIEW);
		return mav;
	}
	
	
	
	private List<Person> getPeople(){
		List<Person> people = new ArrayList<Person>();
		
		people.add(new Person("Claudio", 30));
		people.add(new Person("Snake", 50));
		people.add(new Person("Anita", 30));
		people.add(new Person("Eva", 40));
		people.add(new Person("Paz", 40));
		
		return people;
		
	}

}
