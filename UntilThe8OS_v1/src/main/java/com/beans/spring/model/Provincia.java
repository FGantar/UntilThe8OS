package com.beans.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * CLASE PROVINCIA Contiene un id y el nombre de la provincia.
 * 
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */
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

	public Provincia(int idprovincia, String provincia) {
		super();
		this.idprovincia = idprovincia;
		this.provincia = provincia;
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

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincia [idprovincia=");
		builder.append(idprovincia);
		builder.append(", provincia=");
		builder.append(provincia);
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((direccion == null) ? 0 : direccion.hashCode());
		result = prime * result + idprovincia;
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
		Provincia other = (Provincia) obj;
		if (direccion == null) {
			if (other.direccion != null)
				return false;
		} else if (!direccion.equals(other.direccion))
			return false;
		if (idprovincia != other.idprovincia)
			return false;
		if (provincia == null) {
			if (other.provincia != null)
				return false;
		} else if (!provincia.equals(other.provincia))
			return false;
		return true;
	}

}
