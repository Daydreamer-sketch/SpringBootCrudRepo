package com.xadmin.SpringBootCrudPractice1.repository;

import org.springframework.data.repository.CrudRepository;

import com.xadmin.SpringBootCrudPractice1.bean.Company;

public interface CompanyRepository extends CrudRepository<Company, Integer>{

}
