package com.example.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.example.model.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

	List<Address> findByCity(@Param("city")String city);
}
