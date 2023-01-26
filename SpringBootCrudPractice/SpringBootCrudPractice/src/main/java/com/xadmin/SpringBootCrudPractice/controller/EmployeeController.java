package com.xadmin.SpringBootCrudPractice.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrudPractice.bean.Employee;
import com.xadmin.SpringBootCrudPractice.service.EmployeeService;

@RestController
public class EmployeeController {
	 
	@Autowired
    private EmployeeService Emp ;
	
	
	@RequestMapping("/employee")
	public List<Employee> getAllEmployee()
	{
		return Emp.getAllEmployee();
	}
	
	@RequestMapping(method = RequestMethod.POST, value="/employee")
	public void addEmployee(@RequestBody Employee employee) 
	{
		Emp.addEmployee(employee);
	}
	
	@RequestMapping(method = RequestMethod.PUT, value="/employee/{empID}")
	public void updateEmployee(@PathVariable int empID,@RequestBody Employee employee) 
	{
		Emp.updateEmployee(empID,employee);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value="/employee/{empID}")
	public void deleteEmployee(@PathVariable int empID) 
	{
		Emp.deleteEmployee(empID);
	}
	
}
