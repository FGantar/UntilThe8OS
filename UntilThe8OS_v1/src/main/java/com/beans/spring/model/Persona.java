package com.beans.spring.model;

import java.sql.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.format.annotation.DateTimeFormat;

import java.util.ArrayList;
import java.util.List;

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

	@Id
	@GeneratedValue
	@Column(name = "IDPERSONA")
	public int idPersona;

	@Column(name = "NOMBRE")
	private String nombre;

	@Column(name = "APELLIDO1")
	private String apellido1;

	@Column(name = "APELLIDO2")
	private String apellido2;

	@Column(name = "DNI")
	private String dni;

	@Column(name = "FECHANACIMIENTO")
	private Date fechaNacimiento;

	@OneToMany(cascade = { CascadeType.ALL }, orphanRemoval=true)
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA", nullable=false)
	private List<Telefono> telefonos;

	@OneToMany(cascade = { CascadeType.ALL },orphanRemoval=true)
	@JoinColumn(name = "IDPERSONA", referencedColumnName = "IDPERSONA", nullable=false)
	private List<Direccion> direcciones;

	public Persona() {
		super();
	}

	public int getId() {
		return idPersona;
	}

	public void setId(int id) {
		this.idPersona = id;
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

	public void setFechaNacimiento(String fechaNacimiento) {
		this.fechaNacimiento = Date.valueOf(fechaNacimiento);
	}

	public List<Telefono> getTelefonos() {
		return telefonos;
	}

	public void setTelefonos(String telefonos) {
		
		System.out.println(telefonos);
		Telefono t= new Telefono();
		t.setTelefono(telefonos);
		List<Telefono> telefonos2 = new ArrayList<>();
		telefonos2.add(t);
		this.telefonos=telefonos2;
		System.out.println(telefonos);
		
	}

	public List<Direccion> getDirecciones() {
		return direcciones;
	}

	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}

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
		builder.append(", direcciones=");
		builder.append(direcciones);
		builder.append("]");
		return builder.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((apellido1 == null) ? 0 : apellido1.hashCode());
		result = prime * result + ((apellido2 == null) ? 0 : apellido2.hashCode());
		result = prime * result + ((direcciones == null) ? 0 : direcciones.hashCode());
		result = prime * result + ((dni == null) ? 0 : dni.hashCode());
		result = prime * result + ((fechaNacimiento == null) ? 0 : fechaNacimiento.hashCode());
		result = prime * result + idPersona;
		result = prime * result + ((nombre == null) ? 0 : nombre.hashCode());
		result = prime * result + ((telefonos == null) ? 0 : telefonos.hashCode());
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
		Persona other = (Persona) obj;
		if (apellido1 == null) {
			if (other.apellido1 != null)
				return false;
		} else if (!apellido1.equals(other.apellido1))
			return false;
		if (apellido2 == null) {
			if (other.apellido2 != null)
				return false;
		} else if (!apellido2.equals(other.apellido2))
			return false;
		if (direcciones == null) {
			if (other.direcciones != null)
				return false;
		} else if (!direcciones.equals(other.direcciones))
			return false;
		if (dni == null) {
			if (other.dni != null)
				return false;
		} else if (!dni.equals(other.dni))
			return false;
		if (fechaNacimiento == null) {
			if (other.fechaNacimiento != null)
				return false;
		} else if (!fechaNacimiento.equals(other.fechaNacimiento))
			return false;
		if (idPersona != other.idPersona)
			return false;
		if (nombre == null) {
			if (other.nombre != null)
				return false;
		} else if (!nombre.equals(other.nombre))
			return false;
		if (telefonos == null) {
			if (other.telefonos != null)
				return false;
		} else if (!telefonos.equals(other.telefonos))
			return false;
		return true;
	}

}
