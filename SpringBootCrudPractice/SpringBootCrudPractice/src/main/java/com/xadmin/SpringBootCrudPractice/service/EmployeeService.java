package com.xadmin.SpringBootCrudPractice.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrudPractice.bean.Employee;

import com.xadmin.SpringBootCrudPractice.repository.EmployeeRepository;


@Service
public class EmployeeService {
	@Autowired
	private EmployeeRepository employeeRepo;
	
	public List<Employee> getAllEmployee()
	{ 
		List<Employee> employee = new ArrayList<>();
		employeeRepo.findAll().forEach(employee::add);
		return employee;
	}

	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

	public void updateEmployee(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

	public void updateEmployee( int empID, Employee employee) {
		// TODO Auto-generated method stub
		employeeRepo.save(employee);
	}

	public void deleteEmployee(int empID) {
		// TODO Auto-generated method stub
		employeeRepo.deleteById(empID);
	}

	
	

}
