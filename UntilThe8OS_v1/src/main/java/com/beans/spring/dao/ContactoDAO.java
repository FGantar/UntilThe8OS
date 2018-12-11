package com.beans.spring.dao;

import java.util.List;

import com.beans.spring.model.Persona;

/**
 * Clase contactoDAO
 * 
 * @author John
 * @version 05/12/2018
 */

public interface ContactoDAO {

	public abstract List<Persona> listaContactos();

	public abstract Persona vistaDetalleContacto(int id);

	public abstract void altaContacto(Persona persona);

	public abstract void modificarContacto(Persona persona);

	public abstract void borrarContacto(int id);

}
