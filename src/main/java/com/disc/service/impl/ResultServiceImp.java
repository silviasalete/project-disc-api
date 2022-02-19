package com.disc.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disc.model.Result;
import com.disc.repository.ResultRepository;
import com.disc.service.ResultService;

@Service
public class ResultServiceImp implements ResultService {
	
	@Autowired
	ResultRepository resultRepository;

	@Override
	public Result save(Result result) {
		return resultRepository.save(result);
	}

	@Override
	public List<Result> list() {
		return resultRepository.findAll();
	}

}
