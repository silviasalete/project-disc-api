package com.disc.service;

import com.disc.model.User;
import com.disc.web.dto.UserRegistrationDto;

public interface UserService {

	User save(UserRegistrationDto userRegistrationDto);
	User findById(Long id);
}
