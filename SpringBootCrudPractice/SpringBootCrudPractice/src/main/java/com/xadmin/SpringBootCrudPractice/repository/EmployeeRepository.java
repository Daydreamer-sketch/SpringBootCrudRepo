package com.xadmin.SpringBootCrudPractice.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrudPractice.bean.Employee;


public interface EmployeeRepository extends CrudRepository<Employee,Integer>
{

}
