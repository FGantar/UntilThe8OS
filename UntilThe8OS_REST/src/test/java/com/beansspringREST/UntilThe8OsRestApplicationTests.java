package com.beansspringREST;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;

import java.time.LocalDate;
import java.time.Month;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import com.beansspringREST.controller.ContactoController;
import com.beansspringREST.model.Persona;
import com.beansspringREST.repository.ContactoRepository;


/**
 * Pruebas Unitarias.
 * 
 * @author Rebeca
 * @version 10/12/2018
 *
 */


@RunWith(SpringRunner.class)
@SpringBootTest

public class UntilThe8OsRestApplicationTests {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	@Autowired
	private ContactoRepository contactoRepository;
	
	@Autowired
	private ContactoController controller;
	
	LocalDate localDate = LocalDate.of(2018, Month.DECEMBER,12);
	
	
	Persona persona = new Persona("pepe", "pepe", "pepe", "pepe", localDate);
	
	
	 @Test
	 public void contexLoads() throws Exception {
	 assertThat(controller).isNotNull();
	 }
	 
	 
     @Test
     public void altaTest() throws Exception {
     
        assertNotNull(contactoRepository.altaContacto(persona));
       
       }
    
	 @Test
	 public void alta() throws Exception {
	       
		 contactoRepository.altaContacto(persona);	   
		 
		 contactoRepository.vistaDetalleContacto(persona.getId());
		 
		 assertNotNull(persona);
		}
		 
	 
	 /* Faltaría que buscase el id a borrar
	  * 
	 @Test
	 public void borrar() throws Exception {
	       
		 contactoRepository.borrarContacto(persona.getId());	   
		 
		 contactoRepository.vistaDetalleContacto(persona.getId());
		 
		 assertNull(persona);
	 }
	 */
}
