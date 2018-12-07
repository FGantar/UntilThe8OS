package com.beans.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "TELEFONO")
public class Telefono {

	@Id
	@GeneratedValue
	@Column(name = "IDTELEFONO")
	private int idtelefono;

	@Column(name = "TELEFONO")
	private String telefono;

	@ManyToOne()
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
	private Persona persona;

	public Telefono() {
		super();
	}

	public Telefono(int idtelefono, String telefono) {
		super();
		this.idtelefono = idtelefono;
		this.telefono = telefono;
	}

	public int getIdtelefono() {
		return idtelefono;
	}

	public void setIdtelefono(int idtelefono) {
		this.idtelefono = idtelefono;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

	@Override
	public String toString() {
		return "Telefono [idtelefono=" + idtelefono + ", telefono=" + telefono + ", persona=" + persona + "]";
	}

}
