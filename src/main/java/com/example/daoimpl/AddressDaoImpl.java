package com.example.daoimpl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Repository;

import com.example.dao.AddressDao;
import com.example.model.Address;
import com.example.repository.AddressRepository;

@Repository
public class AddressDaoImpl implements AddressDao {

	@Autowired
	private AddressRepository addressRepository;
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Override
	public List<Address> getAddress() {
		String sql="select address_id ,address1 ,address2 ,postCode ,city from address";
		
		Query query = entityManager.createNativeQuery(sql, "AddressMapping");
		return query.getResultList();
		
	}
	
	@Override
	public Address getAddressById(Integer addressId) {
		
		//return addressRepository.findOne(addressId);
		return null;
	}
	
	@Override
	public List<Address> getAllAddress() {
		
		return addressRepository.findAll();
	}
	
	@Override
	public List<Address> getAddressByPage() {
			
		return addressRepository.findAll(new PageRequest(0, 10)).getContent();
	}
	
	@Override
	public List<Address> getAddressByPageSort() {
		
		return addressRepository.findAll(new PageRequest(0, 10, Sort.Direction.DESC, "addressId")).getContent();
	}

}
