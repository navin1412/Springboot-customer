package com.navin.springboot.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.navin.springboot.dto.CustomerSavedto;
import com.navin.springboot.dto.CustomerUpdatedto;
import com.navin.springboot.dto.Customerdto;
import com.navin.springboot.entity.Customer;
import com.navin.springboot.repository.CusRepo;
@Service
public class CustomerServiceIMP implements CustomerService {

	
	@Autowired
	private CusRepo cusRepo;
	@Override
	public String addCustomer(CustomerSavedto cusdto) {
	
		
		 Customer customer = new Customer(
	                cusdto.getCustomername(),
	                cusdto.getCustomeraddress(),
	                cusdto.getMobile()
	        );
		
		cusRepo.save(customer);
		
		return customer.getCustomername();
	}
	@Override
	public List<Customerdto> getAllCustomer() {
		List<Customer> getcus=cusRepo.findAll();
		List<Customerdto> customerDTOList=new ArrayList<>();
		for(Customer a:getcus) {
			Customerdto dto=new Customerdto(
				a.getCustomerid(),
				a.getCustomername(),
				a.getCustomeraddress(),
				a.getMobile()
					);
			customerDTOList.add(dto);
			
		}
		
		return customerDTOList;
	}
	@Override
	public String uppdateCustomers(CustomerUpdatedto cusdto) {
		if(cusRepo.existsById(cusdto.getCustomerid())){
			
			Customer customer=cusRepo.getById(cusdto.getCustomerid());
			
			customer.setCustomername(cusdto.getCustomername());
			customer.setCustomeraddress(cusdto.getCustomeraddress());
			customer.setMobile(cusdto.getMobile());
	        cusRepo.save(customer);
			
		}
		else {
			System.out.println("customer id do not exists");
		}
		return null;
	}
	@Override
	public boolean deleteCustomer(int id) {
	
		if(cusRepo.existsById(id)) {
			cusRepo.deleteById(id);
		}
		else {
			System.out.println("customer id not found");
		}
		
		
		return false;
	}

}
