package org.dremlogic.controller;

import java.util.Optional;

import org.dremlogic.entity.EmployeeAddress;
import org.dremlogic.repository.EmplAddressRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class EmplAddressController {
	
	@Autowired
	private EmplAddressRepository repo;
	
	
	@PostMapping("/create")
	public EmployeeAddress createEmplAddress(@RequestBody EmployeeAddress address) {
		return this.repo.save(address);
	}
	
	@GetMapping("/findById/{id}")
	public Optional<EmployeeAddress> findEmplAddressById(@PathVariable Long id) {
		return this.repo.findById(id);
	}
	
	

}
