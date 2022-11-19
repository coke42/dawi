package com.edu.cibertec.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.edu.cibertec.model.Departamento;

@Repository
public interface DepartamentoRepository extends JpaRepository<Departamento, Integer>{

	List<Departamento> findByNombre(@Param("nombre") String nombre);
}
