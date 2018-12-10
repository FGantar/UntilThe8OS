package com.beansspringREST.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;


/**
 * Clase Telefono representa la tabla TELEFONO en la base de datos.
 * 
 * @author Rebeca
 * @version 05/12/2018
 *
 */

@Entity
@Table(name = "TELEFONO")
public class Telefono {


	private int idtelefono;
	private String telefono;
	private Persona persona;

	public Telefono() {
		super();
	}

	public Telefono(int idtelefono, String telefono) {
		super();
		this.idtelefono = idtelefono;
		this.telefono = telefono;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDTELEFONO")
	public int getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}

	@Column(name = "TELEFONO")
	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	@JsonIgnore
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA",insertable = false, updatable = false)
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}	
}
