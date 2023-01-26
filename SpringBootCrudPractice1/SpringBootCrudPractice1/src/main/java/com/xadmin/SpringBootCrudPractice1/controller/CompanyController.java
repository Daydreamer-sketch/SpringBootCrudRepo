package com.xadmin.SpringBootCrudPractice1.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.xadmin.SpringBootCrudPractice1.bean.Company;
import com.xadmin.SpringBootCrudPractice1.service.CompanyService;

@RestController
public class CompanyController {
	
	@Autowired
	private CompanyService cmp;
	
	@RequestMapping("/company")
	public List<Company> getAllCompany()
	{
		return cmp.getAllCompany();
	}
    
	@RequestMapping(method = RequestMethod.POST, value="/company")
    public void addCompany(@RequestBody Company company )
    {
		cmp.addCompany(company);
    }
	
    @RequestMapping(method = RequestMethod.PUT, value="/company/{id}")
    public void updateCompany(@PathVariable int id, @RequestBody Company company)
    {
    	cmp.updateCompany(id,company);
    }
    @RequestMapping(method = RequestMethod.DELETE,value="/company/{id}")
    public void deleteCompany(@PathVariable int id )
    {
    	cmp.deleteCompany(id);
    }
}
