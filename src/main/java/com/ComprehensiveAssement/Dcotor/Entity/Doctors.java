package com.ComprehensiveAssement.Dcotor.Entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


import lombok.Data;

@Entity
@Data

public class Doctors {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int doctorId ;
	private String name;
	private int age;
	private String gender;
	private String specialist;
	

	public int getDoctorId() {
		return doctorId;
	}
	public void setDoctorId(int doctorId) {
		this.doctorId = doctorId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getSpecialist() {
		return specialist;
	}
	public void setSpecialist(String specialist) {
		this.specialist = specialist;
	}
	public Doctors(int doctorId, String name, int age, String gender, String specialist) {
		super();
		this.doctorId = doctorId;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.specialist = specialist;
	}
	public Doctors() {
		super();
	}
	

}

