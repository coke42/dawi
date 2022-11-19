package com.edu.cibertec.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name="provincias")
public class Provincia implements Serializable{

	private static final long serialVersionUID=1l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_prov;
	private String nombre;
	
	@ManyToOne
	@JoinColumn(name = "id_depa")
	private Departamento departamento;

	public int getId_prov() {
		return id_prov;
	}

	public void setId_prov(int id_prov) {
		this.id_prov = id_prov;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Departamento getDepartamento() {
		return departamento;
	}

	public void setDepartamento(Departamento departamento) {
		this.departamento = departamento;
	}

	public Provincia(int id_prov, String nombre, Departamento departamento) {
		super();
		this.id_prov = id_prov;
		this.nombre = nombre;
		this.departamento = departamento;
	}

	public Provincia() {

	}
	
}
