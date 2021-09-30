package com.bridgelabs.service;

import java.util.List;

import com.bridgelabs.dto.AddressBookDto;
import com.bridgelabs.model.AddressBook;

public interface IAddressBookService {
	List<AddressBook> getAll();
	AddressBook getById(int id);
	AddressBook addData(AddressBookDto addressBookDTO);
	AddressBook updateData(int contactid, AddressBookDto addressBookDTO);
	void deleteData(int contactid);

}
