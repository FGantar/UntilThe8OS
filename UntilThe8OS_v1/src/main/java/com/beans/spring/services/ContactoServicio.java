package com.beans.spring.services;

import java.util.List;

import com.beans.spring.model.Persona;

/**
 * INTERFAZ CONTACTOSERVICIO
 * 
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */
public interface ContactoServicio {

	public abstract List<Persona> listaContactos();

	public abstract Persona vistaDetalleContacto(int id);

	public abstract void altaContacto(Persona persona);

	public abstract void modificarContacto(Persona persona);

	public abstract void borrarContacto(int id);

}
