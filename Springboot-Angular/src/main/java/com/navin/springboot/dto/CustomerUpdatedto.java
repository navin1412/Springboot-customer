package com.navin.springboot.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class CustomerUpdatedto {
	
	
	private int customerid;
	
	
	private String customername;
	
	
	private String customeraddress;
	
	
	private int mobile;
	

}
