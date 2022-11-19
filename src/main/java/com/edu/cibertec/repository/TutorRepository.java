package com.edu.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.edu.cibertec.model.Tutor;

public interface TutorRepository extends JpaRepository<Tutor, Integer>{

	List<Tutor> findByNombre(@Param("nombre") String nombre);
	}
