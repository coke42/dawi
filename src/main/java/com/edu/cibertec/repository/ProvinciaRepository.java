package com.edu.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import com.edu.cibertec.model.Provincia;

public interface ProvinciaRepository extends JpaRepository<Provincia, Integer>{

	List<Provincia> findByNombre(@Param("nombre") String nombre);
	}
