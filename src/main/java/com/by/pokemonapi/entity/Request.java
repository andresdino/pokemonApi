package com.by.pokemonapi.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity  // TAREA
@Table(name="request") 
public class Request {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String ipOrigin ;
	
	private String method;
	
	@Column(name = "dateRequest")
	@Temporal(TemporalType.DATE)
	private Date dateRequest;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getIpOrigin() {
		return ipOrigin;
	}
	public void setIpOrigin(String ipOrigin) {
		this.ipOrigin = ipOrigin;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public Date getDateRequest() {
		return dateRequest;
	}
	public void setDateRequest(Date dateRequest) {
		this.dateRequest = dateRequest;
	}
	@Override
	public String toString() {
		return "Request [id=" + id + ", ipOrigin=" + ipOrigin + ", method=" + method + ", dateRequest=" + dateRequest
				+ "]";
	}
	
	

}
