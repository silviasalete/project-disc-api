package com.disc.web.dto;

import java.util.Collection;

import com.disc.model.Role;

public class UserView {

	private Long id;
	private String name;
	private String email;
	private String password;
	private String company;
	private Collection<Role> roles;
 
	public UserView(Long id, String name, String email, String password, String company, Collection<Role> roles) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.password = password;
		this.company = company;
		this.roles = roles;
	}
	
	public UserView() {
		super();
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public Collection<Role> getRoles() {
		return roles;
	}
	public void setRoles(Collection<Role> roles) {
		this.roles = roles;
	}
 
}
