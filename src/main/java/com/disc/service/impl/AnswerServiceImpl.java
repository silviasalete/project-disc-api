package com.disc.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.disc.model.Answer;
import com.disc.model.AnswerCalculated;
import com.disc.repository.AnswerRepository;
import com.disc.service.AnswerService;

@Service
public class AnswerServiceImpl implements AnswerService {
	
	@Autowired
	AnswerRepository ansowerRepository;

	@Override
	public AnswerCalculated saveAnsower(Answer ansower) {
		ansowerRepository.save(ansower);
		
		return calculate(ansower);
	}

	private AnswerCalculated calculate(Answer ansower) {		
		 ansower.toString(); 
		return null;
	}

}
