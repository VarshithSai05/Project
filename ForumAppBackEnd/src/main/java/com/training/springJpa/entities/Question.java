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
//@Data
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
	
	public Question (Integer id, String questionTab, Integer userId) {
		this.id=id;
		this.questionTab=questionTab;
		this.user=new User(userId, "","","");
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getQuestionTab() {
		return questionTab;
	}

	public void setQuestionTab(String questionTab) {
		this.questionTab = questionTab;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	

}
