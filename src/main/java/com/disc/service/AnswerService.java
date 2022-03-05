package com.disc.service;

import com.disc.model.Answer;
import com.disc.model.AnswerCalculated;

public interface AnswerService {
	void saveAnsower(Answer ansower);
	AnswerCalculated calculate(Answer ansower);
}
