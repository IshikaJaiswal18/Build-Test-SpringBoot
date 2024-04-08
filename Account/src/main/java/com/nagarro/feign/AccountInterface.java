package com.nagarro.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.nagarro.dto.CustomerEntity;


@FeignClient("CustomerService")
public interface AccountInterface {
	@GetMapping("/customer/{id}")
	public CustomerEntity getSingleCustomer(@PathVariable Long id) ;
	
	 @GetMapping("/customer/validate/{customerId}/{customerName}")
	    public ResponseEntity<Boolean> validateCustomer(@PathVariable Long customerId, @PathVariable String customerName) ;
	      

}