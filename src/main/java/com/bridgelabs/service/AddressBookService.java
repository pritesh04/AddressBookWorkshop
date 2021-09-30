package com.bridgelabs.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.bridgelabs.dto.AddressBookDto;
import com.bridgelabs.model.AddressBook;

@Service
public class AddressBookService implements IAddressBookService{

List<AddressBook> list = new ArrayList<>();
	
	@Override
	public List<AddressBook> getAll() {
		return list;
	}

	@Override
	public AddressBook getById(int id) {
		return list.get(id-1);
	}


	@Override
	public AddressBook updateData(int id, AddressBookDto addressBookDTO) {
		AddressBook AddressBook = list.get(id-1);
		AddressBook.setAddress(addressBookDTO.getAddress());
		AddressBook.setFirstName(addressBookDTO.getFirstName());
		AddressBook.setPhoneNumber(addressBookDTO.getPhoneNumber());
		list.set(contactid-1, AddressBook);
		return AddressBook;
	}

	@Override
	public void deleteData(int id) {
		list.remove(id-1);
	}
	
	@Override
	public AddressBook addData(AddressBookDto addressBookDTO) {
		int id = list.size()+1;
		AddressBook AddressBook = new AddressBook(id, addressBookDTO);
		list.add(AddressBook);
		return AddressBook;
	}


	
}

