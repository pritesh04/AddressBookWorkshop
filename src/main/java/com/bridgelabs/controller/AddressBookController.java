package com.bridgelabs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bridgelabs.dto.AddressBookDto;
import com.bridgelabs.dto.ResponseDto;
import com.bridgelabs.model.AddressBook;
import com.bridgelabs.service.IAddressBookService;

@RestController
public class AddressBookController {
	

	@Autowired
	public IAddressBookService addressBookService;
	
	@RequestMapping({"/get"})
	public ResponseEntity<ResponseDto> getAddressBook() {
		List<AddressBook> AddressBook = addressBookService.getAll();
		ResponseDto resp = new ResponseDto("Get call success", AddressBook);
		return new ResponseEntity<ResponseDto>(resp,HttpStatus.OK);
	}
	
	@GetMapping("/get/{id}")
	public ResponseEntity<ResponseDto> getAddressBookById(@PathVariable int id){
		AddressBook AddressBook = addressBookService.getById(id);
		ResponseDto resp = new ResponseDto("Get call success", AddressBook);
		return new ResponseEntity<ResponseDto>(resp,HttpStatus.OK);
	}
	
	@PostMapping("/create")
	public ResponseEntity<ResponseDto> createAddressBook(@RequestBody AddressBookDto addressBookDTO){
		AddressBook AddressBook = addressBookService.addData(addressBookDTO);
		ResponseDto resp = new ResponseDto("Add call success", AddressBook);
		return new ResponseEntity<ResponseDto>(resp,HttpStatus.OK);
	}
	
	@PutMapping("/update/{id}")
	public ResponseEntity<ResponseDto> updateAddressBook(@PathVariable int id,@RequestBody AddressBookDto addressBookDTO){
		AddressBook AddressBook = addressBookService.updateData(id,addressBookDTO);
		ResponseDto resp = new ResponseDto("Update success", AddressBook);
		return new ResponseEntity<ResponseDto>(resp,HttpStatus.OK);
	}
	
	@DeleteMapping("/delete/{id}")
	public ResponseEntity<ResponseDto> deleteAddressBook(@PathVariable int id){
		addressBookService.deleteData(id);
		ResponseDto resp = new ResponseDto("Delete success", id);
		return new ResponseEntity<ResponseDto>(resp,HttpStatus.OK);
	}
	

}
