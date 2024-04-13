package com.navin.springboot.dto;

import com.navin.springboot.entity.Customer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Customerdto {
	
	private int customerid;
	
	
	private String customername;
	
	
	private String customeraddress;
	
	
	private int mobile;
	

}
