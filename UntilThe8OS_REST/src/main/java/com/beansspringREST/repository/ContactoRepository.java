package com.beansspringREST.repository;

import java.util.List;
import java.util.Optional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.beansspringREST.model.Persona;


/**
 * Clase ContactoRepository representa el acceso a la base de datos.
 * 
 * @author Rebeca
 * @version 08/12/2018
 *
 */

@Repository
public class ContactoRepository implements IContactoRepository{

	@PersistenceContext	
	private EntityManager entityManager;	
	
	
	public ContactoRepository() {

	}

	long currentId = 100;
	
	
	@SuppressWarnings("unchecked")
	@Override
	@Transactional
	public List<Persona> listaContactos(){
		String hql = "FROM Persona p ORDER BY p.id";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	
	@Override
	@Transactional
	public Persona vistaDetalleContacto(int id){
		return entityManager.find(Persona.class, id);
	}

	@Override
	@Transactional
	public Persona altaContacto(Persona persona) {
		entityManager.merge(persona);
			
		return persona;
		
	}

	@Override
	@Transactional
	public Optional<Persona> modificarContacto(Persona persona) {
		entityManager.merge(persona);
		
		return Optional.ofNullable(persona);
		
	}

	@Override
	@Transactional
	public  Optional<Persona> borrarContacto(int id) {
		Persona p = vistaDetalleContacto(id);
		
		if(p != null)
			entityManager.remove(p);
		
		entityManager.flush();
		
		return Optional.ofNullable(p);
	}
	
}
