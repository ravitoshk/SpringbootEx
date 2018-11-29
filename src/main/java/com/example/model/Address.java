package com.example.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityResult;
import javax.persistence.FieldResult;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SqlResultSetMapping;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "address")
@JsonIgnoreProperties(ignoreUnknown = true)
@Getter
@Setter
@SqlResultSetMapping(
        name = "AddressMapping",
        entities = @EntityResult(
                entityClass = Address.class,
                fields = {
                    @FieldResult(name = "addressId", column = "address_id"),
                    @FieldResult(name = "address1", column = "address1"),
                    @FieldResult(name = "address2", column = "address2"),
                    @FieldResult(name = "postCode", column = "postCode"),
                    @FieldResult(name = "city", column = "city")
                	}))
public class Address {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "address_id")
	private Integer addressId;
	
	//@Column(name = "address1")
	private String address1;
	
	//@Column(name = "address2")
	private String address2;
	
	//@Column(name = "city")
	private String city;
	
	//@Column(name = "postCode")
	private String postCode;

}
