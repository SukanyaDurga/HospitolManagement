package com.ComprehensiveAssement.Dcotor.VO;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import com.ComprehensiveAssement.Dcotor.Entity.Doctors;
import com.fasterxml.jackson.annotation.JsonBackReference;

import lombok.Data;
@Entity
@Data
public class Patients {
	
	@Id
	private int patientId;
	private String name;
	private String dateOfVisit ;
	private String doctorName ;
	
	@ManyToOne(fetch = FetchType.LAZY,cascade = CascadeType.ALL)
	@JoinColumn(name = "doctorName",insertable = false,updatable = false)
	@JsonBackReference
	
	
	private Doctors doctors;
	

	
	public Doctors getDoctors() {
		return doctors;
	}
	public void setDoctor(Doctors doctors) {
		this.doctors = doctors;
	}
	public Patients(int patientId, String name, String dateOfVisit, String doctorNmae ,Doctors doctors) {
		super();
		this.patientId = patientId;
		this.name = name;
		this.dateOfVisit = dateOfVisit;
		this.doctorName = doctorName;
		this.doctors = doctors ;
		
	}
	public int getPatientId() {
		return patientId;
	}
	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDateOfVisit() {
		return dateOfVisit;
	}
	public void setDateOfVisit(String dateOfVisit) {
		this.dateOfVisit = dateOfVisit;
	}
	public String getDoctorName() {
		return doctorName;
	}
	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}
	

	public Patients() {
		super();
	}
	
	
	

}
