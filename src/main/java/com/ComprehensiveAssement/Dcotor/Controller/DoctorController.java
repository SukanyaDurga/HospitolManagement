package com.ComprehensiveAssement.Dcotor.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ComprehensiveAssement.Dcotor.Entity.Doctors;
import com.ComprehensiveAssement.Dcotor.Service.DoctorService;
import com.ComprehensiveAssement.Dcotor.VO.ResponseTemplateVO;


import lombok.extern.slf4j.Slf4j;

@RestController
@CrossOrigin(origins = "*", allowedHeaders = "*")

public class DoctorController {
	@Autowired
	private DoctorService doctorService;
	
	@PostMapping("/Doctors")
	public Doctors createDoctor (@RequestBody Doctors doctor)
	{
		
		return doctorService.saveDoctor(doctor);
	}
	@GetMapping("/Doctors")
	 public List<Doctors> getDoctorList()
	   {
		  return (doctorService.getAllDoctors() );
	   }
	@GetMapping("/Doctors/{id}")
	public Doctors getDoctorById(@PathVariable("id") int doctorId)
	{
		return doctorService.findDoctorByDoctorId(doctorId);
	}
	@GetMapping("/Doctors/Patients/{doctorId}")
 	public int getDoctorWithPatients(@PathVariable("doctorId") @RequestBody int doctorId  , @RequestBody List<ResponseTemplateVO> vo )
	{
		return doctorService.getDoctorWithPatients(doctorId ,vo);
	}
	
	@GetMapping("/DoctorsByName/{name}")
	public Doctors getDoctorByName(@PathVariable("name") String name)
	{
		return doctorService.findDoctorByDoctorName(name);
	}
	
	
	
	
 
}
