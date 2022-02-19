package com.disc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disc.model.Company;
import com.disc.service.CompanyService;
import com.disc.web.dto.CompanyDto;

@RestController
@RequestMapping("/company")
@CrossOrigin("*")
public class CompanyController {

	@Autowired
	private CompanyService companyService;

	@GetMapping()
	public List<Company> listAll() {
		return companyService.list();
	}

	@GetMapping("/{id}")
	public Company findById(@PathVariable Long id) {
		return companyService.findById(id);
	}
	
	@PostMapping("/save")
	public Company save(@RequestBody CompanyDto companyDto ) {
		System.out.println("companyDto:"+companyDto.toString());
		return companyService.save(companyDto.toEntity());
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> save(@PathVariable Long id) {
		 companyService.delete(id);
		 return ResponseEntity.ok().build();
	}
}
