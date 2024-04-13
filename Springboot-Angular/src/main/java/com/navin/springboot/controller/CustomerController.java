package com.navin.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.navin.springboot.dto.CustomerSavedto;
import com.navin.springboot.dto.CustomerUpdatedto;
import com.navin.springboot.dto.Customerdto;
import com.navin.springboot.service.CustomerService;

@RestController
@CrossOrigin
@RequestMapping("api/v1/customer")
public class CustomerController {
	
	@Autowired
	private CustomerService customerService;
	
	@PostMapping(path="/save")
	public String saveCustomer(@RequestBody CustomerSavedto cusdto) {
		
		String id=customerService.addCustomer(cusdto);
		
		return id;
		
	}
	@GetMapping(path="/getAllCustomer")
	public List<Customerdto> getAllCustomers() {
		
		List<Customerdto> allCus=customerService.getAllCustomer();
		
		return allCus;
		
	}
	@PutMapping(path="/update")
	public String updateCustomer(@RequestBody CustomerUpdatedto cusdto) {
		
		String id=customerService.uppdateCustomers(cusdto);
		
		return id;
		
	}
	
	@DeleteMapping(path="/deletecustomer/{id}")
	public String deleteCustomer(@PathVariable(value="id") int id) {
		boolean deletecustomer=customerService.deleteCustomer(id);
		return "deleted";
	}

}
