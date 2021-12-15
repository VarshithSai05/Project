package com.training.springJpa.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.training.springJpa.entities.Question;
import com.training.springJpa.entities.User;
import com.training.springJpa.service.QuestionService;

@RestController
public class QuestionController {

	@Autowired
	QuestionService service;
	
	@GetMapping("/viewAllQuesitions")
	Iterable<Question> getAllQuestions(){
		return service.getAllQuestions();
	}
	
	@GetMapping("/viewQuestion/{UserId}")
	List<Question> findQuestionByUserId(@PathVariable Integer UserId) {
		return service.findQuestionsByUserId(UserId);
	}

	@PostMapping("/question/{userId}")
	void addQuestion(@RequestBody Question theQuestion,@PathVariable Integer userId) {
		theQuestion.setUser(new User(userId,"","",""));
		service.addQuestion(theQuestion);
	}

	@PutMapping("/question/{userId}")
	Question updateQuestionByUserId(@RequestBody Question theQuestion, @PathVariable Integer userId) {
		theQuestion.setUser(new User(userId, "", "", ""));
		return service.updateQuestionById(theQuestion);
	}

	@DeleteMapping("/deleteQuestion/{questionId}")
	void deleteQuestionById(@PathVariable Integer questionId) {
		service.deleteQuestionById(questionId);
	}
}
