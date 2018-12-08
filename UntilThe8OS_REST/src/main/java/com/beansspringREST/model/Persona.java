package com.beansspringREST.model;

import java.time.LocalDate;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.Set;


/**
 * Clase Persona representa la tabla PERSONA y sus relaciones en la base de datos.
 * 
 * @author Rebeca
 * @version 05/12/2018
 *
 */

@Entity
@Table(name = "PERSONA")
public class Persona {

	private int idpersona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private LocalDate fechanacimiento;
	private Set<Telefono> telefonos;
	private Set<Direccion> direcciones;



	@Id
	@GeneratedValue
	@Column(name = "IDPERSONA")
	public int getId() {
		return idpersona;
	}

	public void setId(int id) {
		this.idpersona = id;
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
	
	@Column(name = "fechanacimiento")
	public LocalDate getFechaNacimiento() {
		return fechanacimiento;
	}

	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechanacimiento = fechaNacimiento;
	}
	
	@OneToMany()
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
	public Set<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(Set<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	
	@OneToMany()
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA")
	public Set<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(Set<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

	/*
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idPersona=");
		builder.append(idPersona);
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
		builder.append(", telefonos=");
		builder.append(telefonos);
		builder.append(", direccion=");
		builder.append(direccion);
		builder.append("]");
		return builder.toString();
	}
	*/

}
