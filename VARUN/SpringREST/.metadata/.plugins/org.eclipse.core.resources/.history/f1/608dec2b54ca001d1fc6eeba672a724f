package com.question3.service;

import java.util.ArrayList;

import java.util.Arrays;
import java.util.List;

import com.question3.address.Address;

public class AddressService {
	
	
	private List<Address> address = new ArrayList<>(Arrays.asList(
			new Address("1234", "Bhopal", "MP", "India"),
			new Address("1255", "Gorakhpur", "UP", "India"),
			new Address("1534", "jalndhar", "Punjab", "India")
			));
	
	public Address getTopic(String id) {
//		return address.stream().filter(t -> t.getZipCode().equals(id)).findFirst().get();
		return address.stream().filter(s-> s.getZipCode().equals(id)).findFirst().get();

}
}