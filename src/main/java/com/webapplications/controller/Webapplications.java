package com.webapplications.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Webapplications {
	@GetMapping(path="/get")
	public String get()
	{
		return "Hello world";
	}
	

}
