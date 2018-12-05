package com.beans.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

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

	@Id
	@GeneratedValue
	
	@Column(name = "IDDIRECCION")
	public int idDireccion;
	
	@Column(name = "DIRECCION")
	public String direccion;
	
	@Column(name = "CODPOSTAL")
	public int codPostal;
	
	@Column(name = "LOCALIDAD")
	public String localidad;
	
	@Column(name = "IDPROVINCIA")
	public int idProvincia;
	
	@Column(name = "IDPERSONA")
	public int idPersona;
	
	@OneToOne(mappedBy = "direccion")
	private Provincia provincia;

	public Direccion() {
		super();
	}

	public int getIdDireccion() {
		return idDireccion;
	}

	public void setIdDireccion(int idDireccion) {
		this.idDireccion = idDireccion;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public int getCodPostal() {
		return codPostal;
	}

	public void setCodPostal(int codPostal) {
		this.codPostal = codPostal;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public int getIdProvincia() {
		return idProvincia;
	}

	public void setIdProvincia(int idProvincia) {
		this.idProvincia = idProvincia;
	}

	public int getIdPersona() {
		return idPersona;
	}

	public void setIdPersona(int idPersona) {
		this.idPersona = idPersona;
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
