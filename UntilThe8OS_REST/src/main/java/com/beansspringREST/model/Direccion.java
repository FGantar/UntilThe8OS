package com.beansspringREST.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import org.hibernate.annotations.Cascade;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Clase Direccion representa la tabla DIRECCION en la base de datos.
 * 
 * @author Rebeca
 * @version 05/12/2018
 *
 */


@Entity
@Table(name = "DIRECCION")
public class Direccion {



	private int idDireccion;
	private String direccion;
	private int codPostal;
	private String localidad;	
	//private int idProvincia;	
	//private int idPersona;
	private Provincia provincia;
	private Persona persona;


	public Direccion() {
		super();
	}

	@Id
	@GeneratedValue
	@Column(name = "IDDIRECCION")
	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	@Column(name = "DIRECCION")
	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	@Column(name = "CODPOSTAL")
	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	@Column(name = "LOCALIDAD")
	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
	
	@OneToOne()
	@JoinColumn(name = "IDPROVINCIA", referencedColumnName = "IDPROVINCIA")
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
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
