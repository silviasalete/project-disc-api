package com.disc.model;


import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Opcao {
	
	@Id
	private Long id;
	private String nome;
	@ManyToOne
	private Area area;
	private Integer question;
	
	public Opcao() {
		super();
	}

	public Opcao(Long id, String nome, Area area) {
		super();
		this.id = id;
		this.nome = nome;
		this.area = area;
	}
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
 
	public Area getArea() {
		return area;
	} 
	
	public void setArea(Area area) {
		this.area = area;
	}

	public Integer getQuestion() {
		return question;
	}

	public void setQuestion(Integer question) {
		this.question = question;
	}

	@Override
	public String toString() {
		return "Opcao [id=" + id + ", nome=" + nome + ", area=" + area + ", question=" + question + "]";
	}
	
}
