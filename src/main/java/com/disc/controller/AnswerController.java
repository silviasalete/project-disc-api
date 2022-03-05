package com.disc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.disc.model.Answer;
import com.disc.model.AnswerByUser;
import com.disc.model.AnswerCalculated;
import com.disc.service.AnswerService;

@RestController
@RequestMapping("/answer")
@CrossOrigin(origins = "*")
public class AnswerController {
	
	@Autowired
	public AnswerService answerService;
	
	@PostMapping("/save")
	public AnswerCalculated save(@RequestBody AnswerByUser answerByUser) {
		List<Answer> listAnswer = answerByUser.getListAnswer();
		listAnswer.forEach(answer -> {
			answer.setUser(answerByUser.getId());
			answerService.saveAnsower(answer);
		});
		
		AnswerCalculated answerCalculated = new AnswerCalculated();
		answerCalculated.setPointsAreaExecutor1(0);
		answerCalculated.setPointsAreaComunicador2(0);
		answerCalculated.setPointsAreaPlanejador3(0);
		answerCalculated.setPointsAreaAnalista4(0);
		
		listAnswer.forEach(answer -> {

			switch (answer.getArea()) {
			case 1:
				answerCalculated.setPointsAreaExecutor1(answerCalculated.getPointsAreaExecutor1() + 1);
				break;
			case 2:
				answerCalculated.setPointsAreaComunicador2(answerCalculated.getPointsAreaComunicador2() + 1);
				break;
			case 3:
				answerCalculated.setPointsAreaPlanejador3(answerCalculated.getPointsAreaPlanejador3() + 1);
				break;
			case 4:
				answerCalculated.setPointsAreaAnalista4(answerCalculated.getPointsAreaAnalista4() + 1);
				break;

			default:
				break;
			}
		});
		
		return answerCalculated;
	}
}
