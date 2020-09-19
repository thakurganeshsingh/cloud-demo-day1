package com.herman.health.employee;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HealthContoller {
	
	@Autowired
	private EmployeeRepository employeeRepository;
	
	@GetMapping("/employee")
	public  Iterable<EmployeeDao> employee()
	{	
		return employeeRepository.findAll();
	}
	
	@GetMapping("/employee/{id}")
	public  Optional<EmployeeDao> employee(@PathVariable("id")long id)
	{
		return employeeRepository.findById(id);
	}
	
	

}
