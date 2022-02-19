package com.disc.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Answer {

	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private int user;
    private String nome;
    private int area;
    private Boolean answered;
    private int orderTask;
    
	public Answer(Long id, int user, String nome, int area, Boolean answered, int orderTask) {
		super();
		this.id = id;
		this.user = user;
		this.nome = nome;
		this.area = area;
		this.answered = answered;
		this.orderTask = orderTask;
	}
	public Answer() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public int getUser() {
		return user;
	}
	public void setUser(int user) {
		this.user = user;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public Boolean getAnswered() {
		return answered;
	}
	public int getOrderTask() {
		return orderTask;
	}
	public void setOrderTask(int orderTask) {
		this.orderTask = orderTask;
	}
	public void setAnswered(Boolean answered) {
		this.answered = answered;
	}
	 
}
