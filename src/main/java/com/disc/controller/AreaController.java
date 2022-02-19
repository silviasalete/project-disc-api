package com.disc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disc.model.Area;
import com.disc.service.AreaService;

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
