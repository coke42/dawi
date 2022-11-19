package com.edu.cibertec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="departamentos")
public class Departamento implements Serializable{

	private static final long serialVersionUID=1l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_depa;
	private String nombre;
	public int getId_depa() {
		return id_depa;
	}
	public void setId_depa(int id_depa) {
		this.id_depa = id_depa;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Departamento(int id_depa, String nombre) {
		super();
		this.id_depa = id_depa;
		this.nombre = nombre;
	}
	public Departamento() {
		super();
	}
	
	
}
