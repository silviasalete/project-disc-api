package com.disc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.disc.model.User;
import com.disc.repository.UserRepository;
import com.disc.service.UserService;
import com.disc.web.dto.UserRegistrationDto;
@Service
public class UserServiceImpl implements UserService {
	@Autowired
	UserRepository userRepository;

	@Override
	public User save(UserRegistrationDto userRegistrationDto) {
		String passwordCrypt = new BCryptPasswordEncoder().encode(userRegistrationDto.getPassword());
		userRegistrationDto.setPassword(passwordCrypt);
		return userRepository.save(userRegistrationDto.toEntity(userRegistrationDto));
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}
}
