package com.example.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.dao.AddressDao;
import com.example.model.Address;
import com.example.service.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	private AddressDao addressDao;
	
	@Override
	public List<Address> getAddress() {
		return addressDao.getAddress();
	}

	@Override
	public Address getAddressById(Integer addId)
	{
		return addressDao.getAddressById(addId);
	}
	@Override
	public List<Address> getAllAddress()
	{
		return addressDao.getAllAddress();
	}
	
	@Override
	public List<Address> getAddressByPage()
	{
		return addressDao.getAddressByPage();
	}
	
	@Override
	public List<Address> getAddressByPageSort()
	{
		return addressDao.getAddressByPageSort();
	}
}
