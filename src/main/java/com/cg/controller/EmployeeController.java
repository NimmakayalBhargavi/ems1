package com.cg.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	//end points mapped with url
	//@RequestMapping(value="/",method=RequestMethod.GET)
	@GetMapping("/")
	public String index() {
		return "Hello";
	}
	//@RequestMapping(value="/",method=RequestMethod.POST)
	@PostMapping("/")
	public String index1(@RequestBody String name) {
		return "Hello1";
	}

//GET 
//POST
//PUT
//DELETE
//PATCH
}
