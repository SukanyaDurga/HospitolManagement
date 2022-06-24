package com.ComprehensiveAssement.Dcotor.Service;

import java.util.ArrayList;
import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

import com.ComprehensiveAssement.Dcotor.Entity.Doctors;
import com.ComprehensiveAssement.Dcotor.Repository.DoctorRepository;
import com.ComprehensiveAssement.Dcotor.VO.Patients;
import com.ComprehensiveAssement.Dcotor.VO.ResponseTemplateVO;




@Service
public class DoctorService {
	@Autowired
	private DoctorRepository doctorRepository;
  @Autowired
	private RestTemplate restTemplate ;
  
public Doctors findDoctorByDoctorId(int doctorId) {
	
	return  doctorRepository.findByDoctorId(doctorId)  ;
}


public Doctors saveDoctor(Doctors doctor) {
	return doctorRepository.save(doctor);
}


public List<Doctors> getAllDoctors() {
	List<Doctors> doctors = new ArrayList<>();
	 doctorRepository.findAll().forEach(doctors ::add);
	 return doctors;
}







public int getDoctorWithPatients(int doctorId, List<ResponseTemplateVO> vo) {
  //ResponseTemplateVO v = new ResponseTemplateVO();
	
	Doctors doctors=doctorRepository.findByDoctorId(doctorId);
	ResponseEntity<Patients[]> patients= restTemplate.getForEntity("http://localhost:9002/PatientsByDoctorId/"
	                                +doctors.getDoctorId(),    Patients[].class);
	Patients[] p =patients.getBody();
	int len = p.length;
	
	
	return len ;
}


public Doctors findDoctorByDoctorName(String name) {
	
	return  doctorRepository.findByName(name)  ;
}




  

}
