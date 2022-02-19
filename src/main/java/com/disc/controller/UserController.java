package com.disc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disc.model.User;
import com.disc.service.UserService;
import com.disc.web.dto.UserRegistrationDto;
import com.disc.web.dto.UserView;

@RestController
@RequestMapping("/user")
@CrossOrigin(origins = "*")
public class UserController {
	
	@Autowired
	private UserService userService;
	
	@GetMapping
	public List<UserView> findAll() {
		return userService.findAll();
	}
	
	@PostMapping("/save/{typeRegister}")
	public User save(@RequestBody UserRegistrationDto userRegistrationDto, @PathVariable String typeRegister) {
		return userService.save(userRegistrationDto, typeRegister);
	}
	
	@GetMapping("/{id}")
	public User findById(@PathVariable Long id) {
		return userService.findById(id);
	}
}