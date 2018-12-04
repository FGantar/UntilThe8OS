package com.beans.spring.model;

/**
 * CLASE CONTACTO
 * La clase contacto establece un objeto que aúna la información de cada persona
 * @author admin
 * @version 04/12/2018
 *
 */
public class Contacto {
	
	private Persona persona;
	private List<Direccion> direcciones;
	private List<Telefono> telefonos;
	private List<Provincia> provincias;
	public Contacto() {
		super();
	}
	public Contacto(Persona persona, List<Direccion> direcciones, List<Telefono> telefonos,
			List<Provincia> provincias) {
		super();
		this.persona = persona;
		this.direcciones = direcciones;
		this.telefonos = telefonos;
		this.provincias = provincias;
	}
	public Persona getPersona() {
		return persona;
	}
	public void setPersona(Persona persona) {
		this.persona = persona;
	}
	public List<Direccion> getDirecciones() {
		return direcciones;
	}
	public void setDirecciones(List<Direccion> direcciones) {
		this.direcciones = direcciones;
	}
	public List<Telefono> getTelefonos() {
		return telefonos;
	}
	public void setTelefonos(List<Telefono> telefonos) {
		this.telefonos = telefonos;
	}
	public List<Provincia> getProvincias() {
		return provincias;
	}
	public void setProvincias(List<Provincia> provincias) {
		this.provincias = provincias;
	}
	@Override
	public String toString() {
		return "Contacto [persona=" + persona + "]";
	}

	
}
