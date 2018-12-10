package com.beans.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
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

	@GetMapping("/")
	public ModelAndView listaContactos() {
		List<Persona> listaContactos = contactoServicio.listaContactos();
		ModelAndView model = new ModelAndView("ListaContactos");
		model.addObject("listaContactos", listaContactos);
		return model;
	}

	@RequestMapping(value = "/new")
	public ModelAndView newUser(@ModelAttribute Persona persona) {
		ModelAndView model = new ModelAndView("AltaContacto");
		model.addObject("Persona", new Persona());
		return model;		
	}
	
	@GetMapping("/detalle")
	public ModelAndView vistaDetalleContacto(@RequestParam("idPersona") int id) {
		Persona persona = contactoServicio.vistaDetalleContacto(id);
		ModelAndView model = new ModelAndView("VistaDetalleContacto");
		model.addObject("vistaDetalleContacto", persona);
		return model;
	}

	@RequestMapping("/alta")
	public ModelAndView altaContacto(@ModelAttribute Persona persona) {
		//ModelAndView model = new ModelAndView("AltaContacto");
		//model.addObject("contacto", new Persona());
		contactoServicio.altaContacto(persona);
		return new ModelAndView("redirect:/");
	}

	@PutMapping("/modificar")
	public ModelAndView modificarContacto(@RequestParam("idPersona") int id) {
		Persona persona = contactoServicio.vistaDetalleContacto(id);
		ModelAndView model = new ModelAndView("AltaContacto");
		model.addObject("contacto", persona);
		return model;
	}

	@GetMapping("/borrar")
	public ModelAndView borrarContacto(@RequestParam("idPersona") int id) {
		contactoServicio.borrarContacto(id);
		return new ModelAndView("redirect:/");
	}

}
