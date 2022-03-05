package com.disc.model;

import java.util.List;

public class AnswerByUser {
	
    public int id;
    public List<Answer> listAnswer;
    
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public List<Answer> getListAnswer() {
		return listAnswer;
	}
	public void setListAnswer(List<Answer> listAnswer) {
		this.listAnswer = listAnswer;
	}
    
}
