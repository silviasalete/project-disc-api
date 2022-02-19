package com.disc.web.dto;

import java.util.Collections;

import com.disc.model.Role;
import com.disc.model.User;

public class UserRegistrationDto {

    private String name;
    private String email;
    private String password;
    private Long company;

    public UserRegistrationDto() {

    }

    public UserRegistrationDto(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
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

	public Long getCompany() {
		return company;
	}

	public void setCompany(Long company) {
		this.company = company;
	}

	
	public User toEntity(UserRegistrationDto userRegistrationDto, String typeRegister) {
		
		Long company = null;
		
		if (typeRegister.equalsIgnoreCase("admin")) {
			typeRegister = "admin";
			company = (long) 0;
		}

		if (typeRegister.equalsIgnoreCase("user")) {
			typeRegister = "user";
			company = userRegistrationDto.getCompany();
		}
		
		return new User(company,userRegistrationDto.getName(),userRegistrationDto.getEmail(),userRegistrationDto.getPassword(),Collections.singletonList(new Role(typeRegister)));
	}

	@Override
	public String toString() {
		return "UserRegistrationDto [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
}
