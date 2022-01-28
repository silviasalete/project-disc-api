package com.disc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disc.model.Area;
import com.disc.model.User;
import com.disc.service.AreaService;
import com.disc.service.UserService;
import com.disc.web.dto.UserRegistrationDto;

@RestController
@RequestMapping("/area")
public class AreaController {

	@Autowired
	private AreaService areaService;
	
	@PostMapping("/save")
	public Area save(@RequestBody String area) {
		return areaService.save(area.toUpperCase());
	}
}
