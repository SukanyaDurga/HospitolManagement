package com.ComprehensiveAssement.Dcotor.VO;




import com.ComprehensiveAssement.Dcotor.Entity.Doctors;

import lombok.Data;

@Data
public class ResponseTemplateVO {
	private  Patients[] patients;
	private int length ;
	private Doctors doctors;

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public Patients[] getPatients() {
		return patients;
	}

	public void setPatients(Patients[] patients) {
		this.patients = patients;
	}

	public Doctors getDoctors() {
		return doctors;
	}

	public void setDoctors(Doctors doctors) {
		this.doctors = doctors;
	}

	public ResponseTemplateVO(Patients[] patients, int length, Doctors doctors) {
		super();
		this.patients = patients;
		this.length = length;
		this.doctors = doctors;
	}

	public ResponseTemplateVO() {
		super();
	}

	

}
