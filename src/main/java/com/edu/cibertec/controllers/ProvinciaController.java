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

import com.edu.cibertec.model.Provincia;
import com.edu.cibertec.repository.ProvinciaRepository;

@RestController
@RequestMapping("/api")
public class ProvinciaController {

	@Autowired
	private ProvinciaRepository repository;
	
	//CRUD methods
	
	//ListAll
	@GetMapping("/provincias")
	public List<Provincia> obtenerTodos(){
		return repository.findAll();
	}
	
	//Create
	@PostMapping("/provincia")
	public Provincia crearProvincia(@RequestBody Provincia provincia) {
		return repository.save(provincia);
	}
	
	//Update
	@PutMapping("/provincia/{id}")
	public Provincia actualizarProvincia(@PathVariable int id, @RequestBody Provincia provincia) {
		return repository.save(provincia);
	}
	
	//Delete
	@DeleteMapping("provincia/{id}")
	public void eliminarProvincia(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/provincia/{nombre}")
	public List<Provincia> obtenerProvinciasPorNombre(@PathVariable("nombre") String nombre){
		return repository.findByNombre(nombre);
	}
}
