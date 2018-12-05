package com.beans.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
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
		model.addObject("listaContactos", listaContactos);
		return model;
	}
	
	@RequestMapping("/detalle")
	public ModelAndView vistaDetalleContacto (@RequestParam("id") int id) {
		Contacto contacto = contactoServicio.vistaDetalleContacto(id);
		ModelAndView model = new ModelAndView("VistaDetalleContacto");
		model.addObject("vistaDetalleContacto", contacto);
		return model;
	}
	
	@RequestMapping("/alta")
	public ModelAndView altaContacto(@ModelAttribute Contacto contacto) {
		ModelAndView model = new ModelAndView("AltaContacto");
		model.addObject("contacto", new Contacto());
		return model;
	}
	
	@RequestMapping("/modificar")
	public ModelAndView modificarContacto(@RequestParam("id") int id) {
		Contacto contacto = contactoServicio.vistaDetalleContacto(id);
		ModelAndView model = new ModelAndView("AltaContacto");
		model.addObject("contacto", contacto);
		return model;	
	}
	
	@RequestMapping("/borrar")
	public ModelAndView borrarContacto(@RequestParam("id") int id) {
		contactoServicio.borrarContacto(id);
		return new ModelAndView("redirect:/");
	}

}
