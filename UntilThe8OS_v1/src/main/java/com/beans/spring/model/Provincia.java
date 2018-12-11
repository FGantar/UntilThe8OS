package com.beans.spring.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

/**
 * CLASE PROVINCIA Contiene un id y el nombre de la provincia.
 * 
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */
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

	private int idprovincia;
	private String provincias;
	private Direccion direccions;

	public Provincia() {
		super();
	}

	public Provincia(String provincias) {
		super();
		this.provincias = provincias;
	}

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPROVINCIA")
	public int getIdprovincia() {
		return idprovincia;
	}

	public void setIdprovincia(int idprovincia) {
		this.idprovincia = idprovincia;
	}

	@Column(name = "PROVINCIA")
	public String getProvincias() {
		return provincias;
	}

	public void setProvincias(String provincias) {
		this.provincias = provincias;
	}

	@OneToOne()
	@JoinColumn(name = "IDPROVINCIA", referencedColumnName = "IDPROVINCIA", insertable = false, updatable = false)
	public Direccion getDireccions() {
		return direccions;
	}

	public void setDireccions(Direccion direccions) {
		this.direccions = direccions;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Provincia [idprovincia=");
		builder.append(idprovincia);
		builder.append(", provincias=");
		builder.append(provincias);
		builder.append(", direccions=");
		builder.append(direccions);
		builder.append("]");
		return builder.toString();
	}

}
