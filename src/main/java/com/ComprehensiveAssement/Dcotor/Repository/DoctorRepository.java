package com.ComprehensiveAssement.Dcotor.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ComprehensiveAssement.Dcotor.Entity.Doctors;

@Repository
public interface DoctorRepository extends JpaRepository<Doctors ,Integer> {

	

	Doctors findByName(String name);

	Doctors findByDoctorId(int doctorId);

	
	

}
