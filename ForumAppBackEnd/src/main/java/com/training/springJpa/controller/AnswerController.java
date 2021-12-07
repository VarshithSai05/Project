package com.training.springJpa.controller;

import java.util.List;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springJpa.entities.Answer;
import com.training.springJpa.entities.Question;
import com.training.springJpa.service.AnswerService;

@RestController
public class AnswerController {

	@Autowired
	AnswerService service;
	
	@GetMapping("/answer/{questionId}")
	List<Answer> getAnswerByQuestionId(@PathVariable Integer questionId) {
		return service.getAnswerByQuestionId(questionId);
	}
	
//	Add answer based on question ID
	@PostMapping("postAnswer/{questionId}")
	Answer postQuestionByQuestionId(@PathVariable Integer questionId,@RequestBody Answer theAnswer) {
		Set<Question> setOfQuestions=theAnswer.getQuestions();
		setOfQuestions.add(new Question(questionId,));
		theAnswer.setQuestions(setOfQuestions);
		return 	null;
	}
}
