package com.bridgelabs.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {
	
	@GetMapping("/get")
	public String hello()
	{
		return "Hello";
	}
	
	@PutMapping("/put")
	public String helloPut()
	{
		return "Hello Updated";
	}
	
	@PostMapping("/post")
	public String helloPost()
	{
		return "Hello created";
	}
	@DeleteMapping("/delete")
	public String helloDelete()
	{
		return "Deleted";
	}
	

}
