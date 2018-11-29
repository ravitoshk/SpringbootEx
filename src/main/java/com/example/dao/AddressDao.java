package com.example.dao;

import java.util.List;

import com.example.model.Address;

public interface AddressDao {
	public List<Address> getAddress();
	public Address getAddressById(Integer addId);
	public List<Address> getAllAddress();
	public List<Address> getAddressByPage();
	public List<Address> getAddressByPageSort();
}
