package com.navin.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.navin.springboot.entity.Customer;
@Repository
public interface CusRepo extends JpaRepository<Customer, Integer> {

}
