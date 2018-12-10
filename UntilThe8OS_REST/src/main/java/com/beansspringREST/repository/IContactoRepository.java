package com.beansspringREST.repository;

import java.util.List;
import java.util.Optional;

import com.beansspringREST.model.Persona;

/**
 * Interafz IContactoRepository.
 * 
 * @author Rebeca
 * @version 08/12/2018
 *
 */

public interface IContactoRepository {

	public abstract List<Persona> listaContactos();
	
	public abstract Persona vistaDetalleContacto(int id);

	public abstract Persona altaContacto(Persona persona);

	public abstract Optional<Persona> modificarContacto(Persona persona);

	public abstract Optional<Persona> borrarContacto(int id);
}
