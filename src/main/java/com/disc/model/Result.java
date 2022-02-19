package com.disc.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Result {

	@Id
	private Long id;
	private String company;
	private String name;
	private String email;
	private Boolean responsed;
	private  Long userId;
	private  Long pointsAreaExecutor1;
	private  Long pointsAreaComunicador2;
	private  Long pointsAreaPlanejador3;
	private  Long pointsAreaAnalista4;
	
	public Result() {
		super();
	}
	
	public Result(Long id, String company, String name, String email, Boolean responsed, Long userId,
			Long pointsAreaExecutor1, Long pointsAreaComunicador2, Long pointsAreaPlanejador3,
			Long pointsAreaAnalista4) {
		super();
		this.id = id;
		this.company = company;
		this.name = name;
		this.email = email;
		this.responsed = responsed;
		this.userId = userId;
		this.pointsAreaExecutor1 = pointsAreaExecutor1;
		this.pointsAreaComunicador2 = pointsAreaComunicador2;
		this.pointsAreaPlanejador3 = pointsAreaPlanejador3;
		this.pointsAreaAnalista4 = pointsAreaAnalista4;
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public Boolean getResponsed() {
		return responsed;
	}
	public void setResponsed(Boolean responsed) {
		this.responsed = responsed;
	}
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public Long getPointsAreaExecutor1() {
		return pointsAreaExecutor1;
	}
	public void setPointsAreaExecutor1(Long pointsAreaExecutor1) {
		this.pointsAreaExecutor1 = pointsAreaExecutor1;
	}
	public Long getPointsAreaComunicador2() {
		return pointsAreaComunicador2;
	}
	public void setPointsAreaComunicador2(Long pointsAreaComunicador2) {
		this.pointsAreaComunicador2 = pointsAreaComunicador2;
	}
	public Long getPointsAreaPlanejador3() {
		return pointsAreaPlanejador3;
	}
	public void setPointsAreaPlanejador3(Long pointsAreaPlanejador3) {
		this.pointsAreaPlanejador3 = pointsAreaPlanejador3;
	}
	public Long getPointsAreaAnalista4() {
		return pointsAreaAnalista4;
	}
	public void setPointsAreaAnalista4(Long pointsAreaAnalista4) {
		this.pointsAreaAnalista4 = pointsAreaAnalista4;
	}
	
}
