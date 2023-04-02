package com.springrest.service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

import com.springrest.model.Address;

@Service
public class AddressService {

	List<Address> list = new ArrayList<>(Arrays.asList(new Address(800014, "Patna", "Bihar", "India"), 
			new Address(462022, "Bhopal", "MP", "India"),
			new Address(801505, "phulwari", "Bihar", "India"),
			new Address(801506, "Anisabad", "Bihar", "India"),
			new Address(462021, "Bhopal", "Mp", "India")
			));
			
	
	public Address findByZipcode(long zipcode) {
		for(Address address: list) {
			if(address.getZipcode() == zipcode) {
				return address;
			}
		}
		return null;
	}
	
}
