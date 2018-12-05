package com.beans.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beans.spring.model.Contacto;
import com.beans.spring.model.Persona;

@Repository
public class ContactoDAOImpl implements ContactoDAO {
	
	@PersistenceContext
	private EntityManager entityManager;
	
	public ContactoDAOImpl() {
		
	}
	
	public Contacto getContactoByPersona(Persona persona) {
		return entityManager.find(Contacto.class, persona);
	}
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Contacto> list() {
		
		String hql = "FROM PERSONA";
		return (List<Contacto>) entityManager.createQuery(hql).getResultList();
		
	}
	
	//SaveOrUpdate es solo de Hibernate
	//El problema es que si uso  entityManager.persist(user)   fallaria el EDIT
	
	//@Override DE MOMENTO SIN POR PROBAR
	public void darAltaContacto(Contacto contacto){
		entityManager.merge(contacto);
	}
	
	
	

}
