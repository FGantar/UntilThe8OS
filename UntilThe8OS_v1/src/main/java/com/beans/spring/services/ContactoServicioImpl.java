package com.beans.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.spring.dao.ContactoDAO;
import com.beans.spring.model.Persona;

/**
 * CLASE CONTACTOSERVICIO Establece la capa de servicios.
 * 
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */

@Service
public class ContactoServicioImpl implements ContactoServicio {

	@Autowired
	private ContactoDAO contactoDAO;

	@Override
	public List<Persona> listaContactos() {
		return contactoDAO.listaContactos();
	}

	@Override
	public Persona vistaDetalleContacto(int id) {
		return contactoDAO.vistaDetalleContacto(id);
	}

	@Override
	public void altaContacto(Persona persona) {
		contactoDAO.altaContacto(persona);

	}

	@Override
	public void borrarContacto(int id) {
		contactoDAO.borrarContacto(id);

	}

	@Override
	public void modificarContacto(Persona persona) {
		contactoDAO.modificarContacto(persona);

	}

	@Override
	public List<Persona> Filtrar(String palabra) {
		return contactoDAO.Filtrar(palabra);
	}

}
