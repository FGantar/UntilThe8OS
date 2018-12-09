package com.beansspringREST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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
	private int idProvincia;	
	private int idPersona;
	private Provincia provincia;


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

	@Column(name = "IDPROVINCIA")
	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	@Column(name = "IDPERSONA",insertable = false, updatable = false)
	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
	}
	
	@OneToOne()
	@JoinColumn(name = "IDPROVINCIA", referencedColumnName = "IDPROVINCIA",insertable = false, updatable = false)
	public Provincia getProvincia() {
		return provincia;
	}

	public void setProvincia(Provincia provincia) {
		this.provincia = provincia;
	}
	

	

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Direccion [idDireccion=");
		builder.append(idDireccion);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append(", codPostal=");
		builder.append(codPostal);
		builder.append(", localidad=");
		builder.append(localidad);
		builder.append(", idProvincia=");
		builder.append(idProvincia);
		builder.append(", idPersona=");
		builder.append(idPersona);
		builder.append("]");
		return builder.toString();
	}
	
	
	
}
