package com.disc.model;

import javax.persistence.Entity;
import javax.persistence.Id;
@Entity
public class Area {

	@Id
	private Long id;
	private String nome;
		
	public Area() {
		super();
	}
	public Area(String area) {
		this.nome = area;
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

}
