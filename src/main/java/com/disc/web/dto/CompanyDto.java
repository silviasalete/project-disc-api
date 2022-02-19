package com.disc.web.dto;

import com.disc.model.Company;

public class CompanyDto {

	private Long id;
	private String nome;
	private Long city;
	private Long country;
	 
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Long getCity() {
		return city;
	}
	public void setCity(Long city) {
		this.city = city;
	}
	public Long getCountry() {
		return country;
	}
	public void setCountry(Long country) {
		this.country = country;
	}
	
	public Company toEntity() {
		Company company = new Company();
		company.setId(getId());
		company.setCity(getCity());
		company.setCountry(getCountry());
		company.setNome(getNome());
		return company;
	}
	@Override
	public String toString() {
		return "CompanyDto [id=" + id + ", nome=" + nome + ", city=" + city + ", country=" + country + "]";
	}
	 
	
}
