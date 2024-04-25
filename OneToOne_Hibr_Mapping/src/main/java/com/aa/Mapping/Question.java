package com.aa.Mapping;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
public class Question {
	
	 @Id 
	 @Column(name="ques_id")
	 private int quesId;
	 private String queString;
	 
	 @OneToOne
	 private Answer ans ;

	public Question(int quesId, String queString, Answer ans) {
		super();
		this.quesId = quesId;
		this.queString = queString;
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

	public String getQueString() {
		return queString;
	}

	public void setQueString(String queString) {
		this.queString = queString;
	}

	public Answer getAns() {
		return ans;
	}

	public void setAns(Answer ans) {
		this.ans = ans;
	}
	 
	
}
