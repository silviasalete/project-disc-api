package com.disc.service.impl;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.disc.model.Company;
import com.disc.model.Role;
import com.disc.model.User;
import com.disc.repository.UserRepository;
import com.disc.service.CompanyService;
import com.disc.service.UserService;
import com.disc.web.dto.UserRegistrationDto;
import com.disc.web.dto.UserView;
@Service
public class UserServiceImpl implements UserService {
	
	@Autowired
	UserRepository userRepository;
	
	@Autowired
	CompanyService companyService;

	@Override
	public User save(UserRegistrationDto userRegistrationDto,String typeRegister) {
		String passwordCrypt = new BCryptPasswordEncoder().encode(userRegistrationDto.getPassword());
		userRegistrationDto.setPassword(passwordCrypt);
		return userRepository.save(userRegistrationDto.toEntity(userRegistrationDto, typeRegister));
	}

	@Override
	public User findById(Long id) {
		return userRepository.findById(id).get();
	}

	@Override
	public List<UserView> findAll() {
		
		List<User> listUser = userRepository.findAll();
		List<UserView> listUserView = new ArrayList<>();
		
		for (User user : listUser) {
			Long companyId = user.getCompany();
			Company company = new Company();
			if (companyId != 0) {
				company = companyService.findById(companyId);
			}else {
				company.setNome("Sem Empresa");
			}
			
			UserView userView = new UserView(user.getId(), user.getName(), user.getEmail(), user.getPassword(), company.getNome(),user.getRoles());
			listUserView.add(userView);
		}
		return listUserView;
	}
}
