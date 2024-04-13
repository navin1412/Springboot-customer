package com.navin.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data

@NoArgsConstructor
public class CustomerSavedto {
	
	private String customername;
	
	
	private String customeraddress;
	
	
	private int mobile;


	public CustomerSavedto(String customername, String customeraddress, int mobile) {
		super();
		this.customername = customername;
		this.customeraddress = customeraddress;
		this.mobile = mobile;
	}
	

}
