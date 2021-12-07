package com.training.springJpa.entities;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Answer {

	@Id
	private Integer id;
	private String answerTab; 
//	An answer can be given by multiple users.
	@ManyToOne
	private User user;

	@ManyToMany(mappedBy = "questionAnswered")
	private List<Question> questions= new ArrayList<>();
	
//	public Answer(Integer id, String answerTab, Integer questionId) {
//		this.id = id;
//		this.answerTab = answerTab;
//		this.questions = new Question(
//	}
	

}