package com.training.springJpa.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class Question {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	private String questionTab;
//	A question can be answered by multiple users.
	@ManyToOne
	private User user;
	
	@ManyToMany
	@JoinTable(name= "quesAnswered",
			joinColumns = @JoinColumn(name="QuestionId"),
			inverseJoinColumns = @JoinColumn(name="AnswerId"))
	List<Answer> questionAnswered= new ArrayList<>();
	
//	public Question (Integer id, String questionTab, Integer userId) {
//		this.id=id;
//		this.questionTab=questionTab;
//		this.user.getUserId();
//	}
//	This constructor is required while creating manyToMany relationship with Answer entity
	public Question(Integer id, String questionTab) {
		this.id=id;
		this.questionTab=questionTab;
	}
	
//	public Question(Integer id, Integer userId) {
//		this.id=id;
//		this.user.getUserId();
//	}


}
