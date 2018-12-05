package com.beans.spring.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.beans.spring.model.Contacto;
import com.beans.spring.dao.ContactoDAO;
import com.beans.spring.dao.ContactoDAOImpl;

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
	ContactoDAO contactoDAO;

	@Override
	public List<Contacto> listaContactos() {
		return contactoDAO.listaContactos();
	}

	@Override
	public Contacto vistaDetalleContacto(int id) {
		return contactoDAO.vistaDetalleContacto(id);
	}

	@Override
	public void altaContacto(Contacto contacto) {
		contactoDAO.altaContacto(contacto);

	}

	@Override
	public void modificarContacto(int id) {
		contactoDAO.modificarContacto(id);

	}

	@Override
	public void borrarContacto(int id) {
		contactoDAO.borrarContacto(id);

	}

}
