package com.bridgelabs.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddressBookController {
	
	@GetMapping("/get")
	public ResponseEntity<String> hello()
	{
		return new ResponseEntity<String>("Hello " , HttpStatus.OK);
	}
	
	@PutMapping("/put")
	public ResponseEntity<String> helloPut()
	{
		return new ResponseEntity<String>("Object Updated " , HttpStatus.OK);
	}
	
	@PostMapping("/post")
	public ResponseEntity<String> helloPost()
	{
		return new ResponseEntity<String>("Object Added " , HttpStatus.OK);
	}
	@DeleteMapping("/delete")
	public ResponseEntity<String> helloDelete()
	{
		return new ResponseEntity<String>("Object Deleted " , HttpStatus.OK);
	}
	
	

}
