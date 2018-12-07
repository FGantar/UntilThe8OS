package com.beans.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.beans.spring.model.Persona;
import com.beans.spring.services.ContactoServicio;

/**
 * CLASE CONTROLADORMVC Constituye el controlador del modelo MVC.
 * 
 * @author Cristian G. Fortes
 * @version 05/12/2018
 *
 */
@Controller
public class ControladorMVC {

	@Autowired
	private ContactoServicio contactoServicio;

	@RequestMapping("/")
	public String listaContactos() {
		List<Persona> listaContactos = contactoServicio.listaContactos();
		ModelAndView model = new ModelAndView();
		model.addObject("listaContactos", listaContactos);
		return "ListaContactos.html";
	}

	@RequestMapping("/detalle")
	public ModelAndView vistaDetalleContacto(@RequestParam("idPersona") int id) {
		Persona persona = contactoServicio.vistaDetalleContacto(id);
		ModelAndView model = new ModelAndView("VistaDetalleContacto");
		model.addObject("vistaDetalleContacto", persona);
		return model;
	}

	@RequestMapping("/alta")
	public ModelAndView altaContacto(@ModelAttribute Persona persona) {
		ModelAndView model = new ModelAndView("AltaContacto");
		model.addObject("contacto", new Persona());
		return model;
	}

	@RequestMapping("/modificar")
	public ModelAndView modificarContacto(@RequestParam("idPersona") int id) {
		Persona persona = contactoServicio.vistaDetalleContacto(id);
		ModelAndView model = new ModelAndView("AltaContacto");
		model.addObject("contacto", persona);
		return model;
	}

	@RequestMapping("/borrar")
	public ModelAndView borrarContacto(@RequestParam("idPersona") int id) {
		contactoServicio.borrarContacto(id);
		return new ModelAndView("redirect:/");
	}

}
