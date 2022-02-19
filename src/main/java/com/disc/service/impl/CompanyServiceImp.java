package com.disc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disc.model.Company;
import com.disc.repository.CompanyRepository;
import com.disc.service.CompanyService;
@Service
public class CompanyServiceImp implements CompanyService {
	
	@Autowired
	CompanyRepository companyRepository;

	@Override
	public Company save(Company company) {
		return companyRepository.save(company);
	}

	@Override
	public List<Company> list() {
		return companyRepository.findAll();
	}

	@Override
	public void delete(Long id) {
		companyRepository.deleteById(id);
	}

	@Override
	public Company findById(Long id) {
		return companyRepository.findById(id).get();
	}

}
