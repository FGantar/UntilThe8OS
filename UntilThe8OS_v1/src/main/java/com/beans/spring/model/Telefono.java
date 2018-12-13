package com.beans.spring.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * 
 * CLASE TELEFONO Clase telefono representa la tabla persona de la base de datos
 * 
 * @author Jorge Castellano
 * @version 04/12/2018
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

	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA",insertable = false, updatable = false)
	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Telefono [idtelefono=");
		builder.append(idtelefono);
		builder.append(", telefono=");
		builder.append(telefono);
		builder.append("]");
		return builder.toString();
	}	
	
	
}