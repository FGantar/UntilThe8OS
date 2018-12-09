package com.beans.spring;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.web.servlet.ModelAndView;

import com.beans.spring.dao.ContactoDAO;
import com.beans.spring.model.Persona;

@RunWith(SpringRunner.class)
@SpringBootTest
public class UntilThe8OsV1ApplicationTests {

	@Autowired
    private TestRestTemplate restTemplate;
	
	@Autowired
	private ModelAndView model;
	
	@Test
	public void contextLoads() {
	}
	
	 @Test
	 public void controller() throws Exception {
	       
	 
	        assertThat(1).isSameAs(model).isEqualTo(this.restTemplate.getForObject("http://localhost:8080/",ModelAndView.class));
	 }
	 
	/* @Autowired   
	 private ContactoDAO contactoDao;
	 
	 @Autowired   
	 private Persona persona;
	 
	 @Test
	 public void alta() throws Exception {
	       
		 contactoDao.altaContacto(persona);	   
		 
		 contactoDao.vistaDetalleContacto(persona.getId());
		 
		 assertNotNull(persona);
		}
		 */
	 
/*	 @Test
	 public void borrar() throws Exception {
	       
		 contactoDao.borrarContacto(persona.getId());	   
		 
		 contactoDao.vistaDetalleContacto(persona.getId());
		 
		 assertNull(persona);
		 
	 }
*/
}
