package com.beans.spring.services;

import java.util.List;

import com.beans.spring.model.Contacto;


/**
 * INTERFAZ CONTACTOSERVICIO
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */
public interface ContactoServicio {
	
	public abstract List<Contacto> listaContactos();

}
