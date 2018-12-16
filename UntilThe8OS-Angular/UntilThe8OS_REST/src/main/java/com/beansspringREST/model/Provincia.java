package com.beansspringREST.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import com.fasterxml.jackson.annotation.JsonIgnore;



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


	private int idprovincia;
	private String provincia;	
	private Direccion direccion;
	

	public Provincia() {
		super();
	}

	public Provincia(int idprovincia, String provincia) {
		super();
		this.idprovincia = idprovincia;
		this.provincia = provincia;
	}

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "IDPROVINCIA")
	public int getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	@Column(name = "PROVINCIA")
	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	
	@OneToOne()
	@JsonIgnore
	@JoinColumn(name = "IDPROVINCIA", referencedColumnName = "IDPROVINCIA",insertable = false, updatable = false)
	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	
}
