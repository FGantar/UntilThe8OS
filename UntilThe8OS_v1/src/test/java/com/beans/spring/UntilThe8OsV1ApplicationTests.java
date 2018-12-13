package com.beans.spring;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import java.sql.Date;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.beans.spring.controller.ControladorMVC;
import com.beans.spring.dao.ContactoDAO;
import com.beans.spring.model.Persona;

@RunWith(SpringRunner.class)

@SpringBootTest
public class UntilThe8OsV1ApplicationTests {
	
	@Test
	public void contextLoads() {
	}
	
	@Autowired
	ControladorMVC controlador;
	 
	 @Test
	 public void controller() throws Exception {
	       
		 assertNotNull(controlador);
	     
	 }
	 
	 @Autowired   
	 private ContactoDAO contactoDao;
	 
	   
	 private Persona persona = new Persona("aaaa","bbbbb","ggggg","aadad",Date.valueOf("2000-12-12"));
	 
	 @Test
	 public void alta() throws Exception {
	  
		 assertNotNull(contactoDao.altaContacto(persona));
		 
		}
		
	 
	 @Test
	 public void borrar() throws Exception {
		 int i;
		 for( i= 0;contactoDao.listaContactos().size()>i;i++) {
			 
		 }
			
	     i--;
	     persona = contactoDao.listaContactos().get(i);
		 contactoDao.borrarContacto(persona.getIdPersona());	   

		assertNull(contactoDao.vistaDetalleContacto(persona.getIdPersona()));
		 
	 }

}

