package com.beansspringREST.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;



/**
 * Clase Provincia representa la tabla PROVINCIA en la base de datos.
 * 
 * @author Rebeca
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
		builder.append(", persona=");
		builder.append("]");
		return builder.toString();
	}


}
