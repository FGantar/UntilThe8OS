package com.beans.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.beans.spring.model.Contacto;
import com.beans.spring.services.ContactoServicio;

/**
 * CLASE CONTROLADORMVC
 * Constituye el controlador del modelo MVC.
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */
@Controller
public class ControladorMVC {

	@Autowired
	private ContactoServicio contactoServicio;

	@RequestMapping("/")
	public ModelAndView listaContactos() {
		List<Contacto> listaContactos = contactoServicio.listaContactos();
		ModelAndView model = new ModelAndView("ListaContactos");
		model.addObject("ListaContactos", listaContactos);
		return model;
	}

}
