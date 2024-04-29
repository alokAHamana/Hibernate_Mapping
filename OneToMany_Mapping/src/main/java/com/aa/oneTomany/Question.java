
package com.aa.oneTomany;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="question")
public class Question {
	
	 @Id 
	 //@Column(name="quesId")
	 private int quesId;
	 private String question;
	 
	 @OneToMany( cascade = CascadeType.ALL)
	 @JoinColumn(name = "quesId")
	 private List<Answer> ans;
	 

	public Question(int quesId, String question, List<Answer> ans) {
		super();
		this.quesId = quesId;
		this.question = question;
		this.ans = ans;
	}


	public Question() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getQuesId() {
		return quesId;
	}


	public void setQuesId(int quesId) {
		this.quesId = quesId;
	}


	public String getQuestion() {
		return question;
	}


	public void setQuestion(String question) {
		this.question = question;
	}


	public List<Answer> getAns() {
		return ans;
	}


	public void setAns(List<Answer> ans) {
		this.ans = ans;
	}

	
	}
