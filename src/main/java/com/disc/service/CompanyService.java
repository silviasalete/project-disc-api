package com.disc.service;

import java.util.List;

import com.disc.model.Company;

public interface CompanyService {

	Company save(Company company);

	List<Company> list();

	void delete(Long id);

	Company findById(Long id);
}
