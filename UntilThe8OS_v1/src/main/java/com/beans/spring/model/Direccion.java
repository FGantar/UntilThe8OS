package com.beans.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
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

	@ManyToOne()
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
	public Persona persona;

	@OneToOne()
	@JoinColumn(name = "IDPROVINCIA", referencedColumnName = "IDPROVINCIA")
	private Provincia provincia;

	public Direccion() {
		super();
	}

	
	public Direccion(String direccion, int codPostal, String localidad) {
		super();
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
	}



	public Direccion(String direccion, int codPostal, String localidad, Provincia provincia) {
		super();
		this.direccion = direccion;
		this.codPostal = codPostal;
		this.localidad = localidad;
		this.provincia = provincia;
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

	public Persona getPersona() {
		return persona;
	}

	public void setPersona(Persona persona) {
		this.persona = persona;
	}

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

		builder.append(", provincia=");
		builder.append(provincia);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + codPostal;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + idDireccion;
		result = prime * result + ((localidad == null) ? 0 : localidad.hashCode());
		result = prime * result + ((persona == null) ? 0 : persona.hashCode());
		result = prime * result + ((provincia == null) ? 0 : provincia.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Direccion other = (Direccion) obj;
		if (codPostal != other.codPostal)
			return false;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (idDireccion != other.idDireccion)
			return false;
		if (localidad == null) {
			if (other.localidad != null)
				return false;
		} else if (!localidad.equals(other.localidad))
			return false;
		if (persona == null) {
			if (other.persona != null)
				return false;
		} else if (!persona.equals(other.persona))
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

}
