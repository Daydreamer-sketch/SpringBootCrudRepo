package com.xadmin.SpringBootCrudPractice1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.xadmin.SpringBootCrudPractice1.bean.Company;
import com.xadmin.SpringBootCrudPractice1.repository.CompanyRepository;

@Service
public class CompanyService {
	
	@Autowired
	private CompanyRepository companyRepo;

	public List<Company> getAllCompany() {
		// TODO Auto-generated method stub
		List<Company> company = new ArrayList<>();
		companyRepo.findAll().forEach(company::add);
		return company;
	}

	public void addCompany(Company company) {
		// TODO Auto-generated method stub
		companyRepo.save(company);
	}

	public void updateCompany(int id, Company company) {
		// TODO Auto-generated method stub
		companyRepo.save(company);
	}

	public void deleteCompany(int id) {
		// TODO Auto-generated method stub
		companyRepo.deleteById(id);
	}
	
	
	

}
