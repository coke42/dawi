package com.edu.cibertec.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.cibertec.model.Departamento;
import com.edu.cibertec.repository.DepartamentoRepository;

@RestController
@RequestMapping("/api")
public class DepartamentoController {

	@Autowired
	private DepartamentoRepository repository;
	
	//CRUD methods
	
	//ListAll
	@GetMapping("/departamentos")
	public List<Departamento> obtenerTodos(){
		return repository.findAll();
	}
	
	//Create
	@PostMapping("/departamento")
	public Departamento crearDepartamento(@RequestBody Departamento departamento) {
		return repository.save(departamento);
	}
	
	//Update
	@PutMapping("/departamento/{id}")
	public Departamento actualizarDepartamento(@PathVariable int id, @RequestBody Departamento departamento) {
		return repository.save(departamento);
	}
	
	//Delete
	@DeleteMapping("departamento/{id}")
	public void eliminarDepartamento(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/departamento/{nombre}")
	public List<Departamento> obtenerDepartamentosPorNombre(@PathVariable("nombre") String nombre){
		return repository.findByNombre(nombre);
	}
}
