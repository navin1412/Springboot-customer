package com.navin.springboot.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="customer")
public class Customer {
	

	@Id
	@Column(name="customer_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int customerid;
	
	@Column(name="customer_name")
	private String customername;
	
	@Column(name="customer_address")
	private String customeraddress;
	
	@Column(name="mobile")
	private int mobile;

	public Customer(String customername, String customeraddress, int mobile) {
		super();
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}
	
	
	
	

}
