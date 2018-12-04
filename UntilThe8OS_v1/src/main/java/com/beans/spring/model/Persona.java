package com.beans.spring.model;

import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * CLASE PERSONA Clase persona es una entidad, representando la tabla persona en
 * la base de datos.
 * 
 * @author Cristian G. Fortes
 * @version 04/12/2018
 *
 */

@Entity
@Table("PERSONA")
public class Persona {

	@Id
	@GeneratedValue
	@Column(name = "IDPERSONA")
	public int id;

	@Column(name = "NOMBRE")
	public String nombre;

	@Column(name = "APELLIDO1")
	public String apellido1;

	@Column(name = "APELLIDO2")
	public String apellido2;

	@Column(name = "DNI")
	public String dni;

	@Column(name = "FECHANACIMIENTO")
	public Date fechaNacimiento;

	public Persona() {
		super();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [id=");
		builder.append(id);
		builder.append(", nombre=");
		builder.append(nombre);
		builder.append(", apellido1=");
		builder.append(apellido1);
		builder.append(", apellido2=");
		builder.append(apellido2);
		builder.append(", dni=");
		builder.append(dni);
		builder.append(", fechaNacimiento=");
		builder.append(fechaNacimiento);
		builder.append("]");
		return builder.toString();
	}

}
