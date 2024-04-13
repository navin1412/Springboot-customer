package com.navin.springboot.service;

import java.util.List;

import com.navin.springboot.dto.CustomerSavedto;
import com.navin.springboot.dto.CustomerUpdatedto;
import com.navin.springboot.dto.Customerdto;

public interface CustomerService {

	String addCustomer(CustomerSavedto cusdto);

	List<Customerdto> getAllCustomer();

	String uppdateCustomers(CustomerUpdatedto cusdto);

	boolean deleteCustomer(int id);

}
