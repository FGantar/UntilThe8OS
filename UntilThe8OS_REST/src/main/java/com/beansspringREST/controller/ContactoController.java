package com.beansspringREST.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.beansspringREST.model.Persona;
import com.beansspringREST.repository.ContactoRepository;;

/**
 * Controlador Contacto
 * 
 * @author Rebeca
 * @version 08/12/2018
 *
 */


@RestController
@RequestMapping("/contacto")
public class ContactoController {
	
	private final ContactoRepository repository;
	
	@Autowired
	public ContactoController(ContactoRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping
	List<Persona> listaContactos(){
		return this.repository.findAll();
	}
	
	@GetMapping("/{id}")
	Persona getContacto(@PathVariable int id){
		return this.repository.findByID(id);
	}
	
	/*
	@PostMapping
	ResponseEntity<?> altaContacto(@RequestBody Contacto contacto) {
		Contacto result = this.repository.save(contacto);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(result.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	Contacto modificarContacto(@RequestBody Contacto contacto) {
		return this.repository.update(contacto)
				.orElseThrow(RuntimeException::new);
	}
	
	@DeleteMapping("/{id}")
	void borrarContacto(@PathVariable int id) {
		this.repository.delete(id).orElseThrow(RuntimeException::new);
	}
	
	*/
}
