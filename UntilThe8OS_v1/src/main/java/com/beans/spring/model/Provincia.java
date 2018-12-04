package com.beans.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "PROVINCIA")
public class Provincia {

	@Id
	@Column(name = "IDPROVINCIA")
	private int idprovincia;

	@Column(name = "PROVINCIA")
	private String provincia;

	@OneToOne(mappedBy = "provincia")
	private Direccion direccion;

	public Provincia() {
		super();
	}

	public Provincia(int idprovincia, String provincia, Direccion direccion) {
		super();
		this.idprovincia = idprovincia;
		this.provincia = provincia;
		this.direccion = direccion;
	}

	public int getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	@Override
	public String toString() {
		return "Provincia [idprovincia=" + idprovincia + ", provincia=" + provincia + "]";
	}

}
