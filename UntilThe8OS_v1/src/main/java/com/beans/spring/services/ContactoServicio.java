package com.beans.spring.services;

import java.util.List;

import com.beans.spring.model.Contacto;

/**
 * INTERFAZ CONTACTOSERVICIO
 * 
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */
public interface ContactoServicio {

	public abstract List<Contacto> listaContactos();

	public abstract Contacto vistaDetalleContacto(int id);

	public abstract void altaContacto(Contacto contacto);

	public abstract void modificarContacto(int id);

	public abstract void borrarContacto(int id);

}
