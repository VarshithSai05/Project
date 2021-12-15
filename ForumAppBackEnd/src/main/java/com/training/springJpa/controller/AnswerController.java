package com.training.springJpa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springJpa.entities.Answer;
import com.training.springJpa.entities.Question;
import com.training.springJpa.service.AnswerService;

@RestController
public class AnswerController {

	@Autowired
	AnswerService service;
	
	@GetMapping("/answer")
	Iterable<Answer> findAllAnswers() {
		return service.findAllAnswers();
	}
	
//	@PostMapping("/addAnswer/{questionId}")
//	void addAnswerByQuestionId
//		(@PathVariable Integer questionId,@RequestBody Answer theAnswer,@RequestBody Integer userId) 
//		{
//			List<Question> listOfQuestions=theAnswer.getQuestions();
//			listOfQuestions.add(new Question(questionId, "",userId ));
//			theAnswer.setQuestions(listOfQuestions);
//			service.addAnswerByQuestionId(theAnswer);		
//		}
	
	@PostMapping("/addAnswer/{questionId}")
	void addAnswerByQuestionId(@PathVariable Integer questionId,@Validated @RequestBody Answer theAnswer) {
		List<Question> listOfQuestions=theAnswer.getQuestions();
		listOfQuestions.add(new Question(questionId,""));
		theAnswer.setQuestions(listOfQuestions);
		service.addAnswerByQuestionId(theAnswer);
	}
	
	
	@PutMapping("/updateAnswer/{answerId}")
	void updateAnswerByAnswerId(@PathVariable Integer answerId,@RequestBody Answer theAnswer) {
		service.updateAnswerByAnswerId(answerId, theAnswer);
		
	}
	
	@DeleteMapping("/deleteAnswer/{answerId}")
	void deleteAnswerByAnswerId(@PathVariable Integer answerId) {
		service.deleteAnswerByanswerId(answerId);
	}
	
	
	
	
}
