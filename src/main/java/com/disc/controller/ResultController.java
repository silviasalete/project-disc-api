package com.disc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disc.model.Result;
import com.disc.service.ResultService;

@RestController
@RequestMapping("/result")
@CrossOrigin(origins = "*")
public class ResultController {

	@Autowired
	private ResultService resultService;

	@GetMapping()
	public List<Result> listAll() {
		return resultService.list();
	}
	
	@PostMapping("/save")
	public Result save(@RequestBody Result result) {
		return resultService.save(result);
	}
}
