package com.edu.cibertec.model;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name="tutores")
public class Tutor implements Serializable{

	private static final long serialVersionUID=1l;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_tutor;
	private String dni;
	private String nombre;
	private String papellido;
	private String sapellido;
	
	@Temporal(value = TemporalType.DATE)
	private Date fnacimiento;
	
	private String telefono;
	
	@ManyToOne
	@JoinColumn(name="id_prov")
	private Provincia provincia;

	public int getId_tutor() {
		return id_tutor;
	}

	public void setId_tutor(int id_tutor) {
		this.id_tutor = id_tutor;
	}


	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getPapellido() {
		return papellido;
	}

	public void setPapellido(String papellido) {
		this.papellido = papellido;
	}

	public String getSapellido() {
		return sapellido;
	}

	public void setSapellido(String sapellido) {
		this.sapellido = sapellido;
	}

	public Date getFnacimiento() {
		return fnacimiento;
	}

	public void setFnacimiento(Date fnacimiento) {
		this.fnacimiento = fnacimiento;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	
	public Tutor(int id_tutor, String dni, String nombre, String papellido, String sapellido, Date fnacimiento,
			String telefono, Provincia provincia) {
		super();
		this.id_tutor = id_tutor;
		this.dni = dni;
		this.nombre = nombre;
		this.papellido = papellido;
		this.sapellido = sapellido;
		this.fnacimiento = fnacimiento;
		this.telefono = telefono;
		this.provincia = provincia;
	}

	public Tutor() {

	}
	
	
}
