package com.aa.Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
	@Column(name = "answer_Id")
	private int ans_Id;
	private String ans;
	
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
		
	}

