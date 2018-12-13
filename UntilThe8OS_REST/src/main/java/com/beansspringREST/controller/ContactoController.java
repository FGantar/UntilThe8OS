package com.beansspringREST.controller;

import java.net.URI;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

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
@CrossOrigin(origins = "*")
public class ContactoController {
	
	private final ContactoRepository repository;
	
		
	@SuppressWarnings("serial")
	@ResponseStatus(HttpStatus.NOT_FOUND)
	class StudentNotFoundException extends RuntimeException {

		public StudentNotFoundException() {
			super("Error en accion sobre Contacto");
		}
	}
	
	@Autowired
	public ContactoController(ContactoRepository repository) {
		this.repository = repository;
	}
	
	@GetMapping  
	
	List<Persona> listaContactos(){
		return this.repository.listaContactos();
	}
	
	@GetMapping("/{id}")
	Persona getContacto(@PathVariable int id){
		return this.repository.vistaDetalleContacto(id);
	}
	
	
	@PostMapping
	ResponseEntity<?> altaContacto(@RequestBody Persona persona) {
		Persona result = this.repository.altaContacto(persona);
		URI location = ServletUriComponentsBuilder
				.fromCurrentRequest()
				.path("/{id}")
				.buildAndExpand(result.getId())
				.toUri();
		
		return ResponseEntity.created(location).build();
	}
	
	@PutMapping
	Persona modificarContacto(@RequestBody Persona persona) {
		return this.repository.modificarContacto(persona)
				.orElseThrow(RuntimeException::new);
	}
	
	@DeleteMapping("/{id}")
	void borrarContacto(@PathVariable int id) {
		this.repository.borrarContacto(id)
		.orElseThrow(RuntimeException::new);
	}
	
	/* Filtrado por provincia
	 * 
	 * @GetMapping("/good-beers")
	 *  @CrossOrigin(origins = "http://localhost:4200")
	public Collection<Beer> goodBeers() {

    	//Utiliza Streams porque es más fácil para filtrar
        return repository
        		.findAll()
        		.stream()
                .filter(this::isGreat)
                .collect(Collectors.toList());
    }

    //Evito las cervezas con estas caracteristicas
    private boolean isGreat(Beer beer) {
        return !beer.getName().equals("Budweiser") &&
                !beer.getName().equals("Coronita") &&
                !beer.getName().equals("Cruzcampo");
    }
    */
}
