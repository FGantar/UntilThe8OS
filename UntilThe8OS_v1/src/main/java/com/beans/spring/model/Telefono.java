package com.beans.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table("TELEFONO")
public class Telefono {

	@Id
	@GeneratedValue
	@Column(name = "IDTELEFONO")
	private int idtelefono;
	
	@Column(name = "TELEFONO")
	private String telefono;
	
	
	
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
