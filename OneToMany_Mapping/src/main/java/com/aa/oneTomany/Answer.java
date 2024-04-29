package com.aa.oneTomany;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity

@Table(name="answer")
public class Answer {

	@Id
	@Column(name = "ans_Id")
	private int ans_Id;
	private String ans;
	
	@ManyToOne
	//@JoinColumn(name="quesId")
	private Question question;
	
	public Answer(int ans_Id, String ans) {
		super();
		this.ans_Id = ans_Id;
		this.ans = ans;
	}

	public Answer() {
		// TODO Auto-generated constructor stub
	}

	public int getAns_Id() {
		return ans_Id;
	}

	public void setAns_Id(int ans_Id) {
		this.ans_Id = ans_Id;
	}

	public String getAns() {
		return ans;
	}

	public void setAns(String ans) {
		this.ans = ans;
	}


	public Question getQuestion() {
		return question;
	}

	public void setQuestion(Question q) {
		// TODO Auto-generated method stub
		
	}
		
	}

