package com.capgemini.onetomany.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Certificates {

	@Id
	private int certificateId;
	private String certificateName;
	@ManyToOne
	private Employee employee;

	public Certificates() {
		super();
	}

	public Certificates(int certificateId, String certificateName) {
		super();
		this.certificateId = certificateId;
		this.certificateName = certificateName;
	}

	public int getCertificateId() {
		return certificateId;
	}

	public void setCertificateId(int certificateId) {
		this.certificateId = certificateId;
	}

	public String getCertificateName() {
		return certificateName;
	}

	public void setCertificateName(String certificateName) {
		this.certificateName = certificateName;
	}

	

	

	

	

	/*
	 * public Employee getEmployee() { return employee; }
	 * 
	 * public void setEmployee(Employee employee) { this.employee = employee; }
	 */
	@Override
	public String toString() {
		return "Certificates [certificateId=" + certificateId + ", certificateName=" + certificateName + "]";
	}



}
