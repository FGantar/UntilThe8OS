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
	
	public abstract List<Persona> Filtrar(String palabra);

	public abstract Persona vistaDetalleContacto(int id);

	public abstract Persona altaContacto(Persona persona);

	public abstract void modificarContacto(Persona persona);

	public abstract void borrarContacto(int id);

}
