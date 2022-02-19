package com.disc.service;

import java.util.List;

import com.disc.model.User;
import com.disc.web.dto.UserRegistrationDto;
import com.disc.web.dto.UserView;

public interface UserService {

	User save(UserRegistrationDto userRegistrationDto, String typeRegister);
	User findById(Long id);
	List<UserView> findAll();
}
