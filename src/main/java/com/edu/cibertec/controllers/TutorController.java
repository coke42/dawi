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

import com.edu.cibertec.model.Tutor;
import com.edu.cibertec.repository.TutorRepository;

@RestController
@RequestMapping("/api")
public class TutorController {

	@Autowired
	private TutorRepository repository;
	
	//CRUD methods
	
	//ListAll
	@GetMapping("/tutores")
	public List<Tutor> obtenerTodos(){
		return repository.findAll();
	}
	
	//Create
	@PostMapping("/tutor")
	public Tutor crearTutor(@RequestBody Tutor tutor) {
		return repository.save(tutor);
	}
	
	//Update
	@PutMapping("/tutor/{id}")
	public Tutor actualizarTutor(@PathVariable int id, @RequestBody Tutor tutor) {
		return repository.save(tutor);
	}
	
	//Delete
	@DeleteMapping("tutor/{id}")
	public void eliminarTutor(@PathVariable("id") int id) {
		repository.deleteById(id);
	}
	
	@GetMapping("/tutor/{nombre}")
	public List<Tutor> obtenerTutorsPorNombre(@PathVariable("nombre") String nombre){
		return repository.findByNombre(nombre);
	}
}
