package com.beans.spring.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
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
@Table(name = "PERSONA")
public class Persona {

	private int idpersona;
	private String nombre;
	private String apellido1;
	private String apellido2;
	private String dni;
	private Date fechaNacimiento;
	private List<Telefono> telefonos;
	private List<Direccion> direcciones;

	public Persona() {
		
		super();
		telefonos=new ArrayList<>();
		direcciones=new ArrayList<>();
		
	}

	
	public Persona(String nombre, String apellido1, String apellido2, String dni, Date fechaNacimiento) {
		super();
		this.nombre = nombre;
		this.apellido1 = apellido1;
		this.apellido2 = apellido2;
		this.dni = dni;
		this.fechaNacimiento=fechaNacimiento;
	}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "IDPERSONA")
	public int getIdPersona() {
		return idpersona;
	}

	public void setIdPersona(int id) {
		this.idpersona = id;
	}

	@Column(name = "NOMBRE")
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	@Column(name = "APELLIDO1")
	public String getApellido1() {
		return apellido1;
	}

	public void setApellido1(String apellido1) {
		this.apellido1 = apellido1;
	}

	@Column(name = "APELLIDO2")
	public String getApellido2() {
		return apellido2;
	}

	public void setApellido2(String apellido2) {
		this.apellido2 = apellido2;
	}

	@Column(name = "DNI")
	public String getDni() {
		return dni;
	}

	public void setDni(String dni) {
		this.dni = dni;
	}
	
	@Column(name = "fechanacimiento")
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	

	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA", nullable=false)
	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(List<Telefono> telefonos) {
		
		
		
		this.telefonos = telefonos;
	}
	


	@OneToMany(cascade = {CascadeType.ALL})
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA", nullable=false)
	public List<Direccion> getDirecciones() {
		
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		
		this.direcciones=direcciones;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Persona [idpersona=");
		builder.append(idpersona);
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
		builder.append(", direcciones=");
		builder.append(direcciones);
		builder.append("]");
		return builder.toString();
	}


	
	
	
}

