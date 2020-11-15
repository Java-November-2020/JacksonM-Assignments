package com.codingdojo.jackson.Dojo;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DojoController {

	@RequestMapping("/")
	public String welcome() {
		return "Welcome";
	}
	
	@RequestMapping("/{name}")
	public String dojo(@PathVariable String name ) {
		return "The " + name + " is awesome";  
	}
	
	@RequestMapping("/{name}/{location}")
	public String location(@PathVariable String name, @PathVariable String location ) {
		String Name = name.substring(0,1).toUpperCase() + name.substring(1);
		String Location = location.substring(0,1).toUpperCase() + location.substring(1);
		return Location + " " + Name + " is located in Southern California";
	}
}
