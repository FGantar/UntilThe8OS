package com.beans.dao;

import java.util.List;

import com.beans.spring.model.Contacto;
import com.beans.spring.model.Persona;

/**
 * DAO de la clase contacto
 * @author John
 * @version 05/12/2018
 */

public class ContactoDAO {

	public List<Contacto> list();
	
	public void darAltaContacto(Contacto contacto);
	
	
}
