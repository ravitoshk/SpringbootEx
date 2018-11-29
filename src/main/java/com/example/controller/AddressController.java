package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.Address;
import com.example.service.AddressService;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;

@CrossOrigin
@Api(value = "Address Controller")
@RestController
@RequestMapping("/address")
public class AddressController 
{
	@Autowired
	private AddressService addressService;
	
	@ApiOperation(value = "Returns all addresses", response = Address.class, produces = "application/json")
	@ApiResponses(value = { @ApiResponse(code = 200, message = "Returns user address") })
	@RequestMapping(path="/getAddress",produces="application/json",method=RequestMethod.GET)
	public List<Address> getAddress()
	{
		return addressService.getAddress();
	}
	
	@RequestMapping(value = "/getAddressById/{addressId}", produces="application/json",method=RequestMethod.GET)
	public Address getAddressById(@PathVariable("addressId") Integer addressId)
	{
		return addressService.getAddressById(addressId);
	}
	
	@RequestMapping(path="/getAllAddress",produces="application/json",method=RequestMethod.GET)
	public List<Address> getAllAddress()
	{
		return addressService.getAllAddress();
	}
	
	@RequestMapping(path="/getAddressByPage",produces="application/json",method=RequestMethod.GET)
	public List<Address> getAddressByPage()
	{
		return addressService.getAddressByPage();
	}
	
	@RequestMapping(path="/getAddressByPageSort",produces="application/json",method=RequestMethod.GET)
	public List<Address> getAddressByPageSort(){
		return addressService.getAddressByPageSort();
	}
	
	@RequestMapping(path="/login")
	public String login(){
		return "success";
	}
}
