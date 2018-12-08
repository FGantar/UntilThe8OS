package com.beansspringREST.repository;

import java.util.List;

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
public class ContactoRepository {

	@PersistenceContext	
	private EntityManager entityManager;	
	
	
	public ContactoRepository() {

	}

	long currentId = 100;
	
	
	@SuppressWarnings("unchecked")
	@Transactional
	public List<Persona> findAll(){
		
		String hql = "SELECT DISTINCT persona FROM Persona persona "+
		"left join fetch persona.telefonos as telefonos " +
		"left join fetch persona.direcciones as direcciones " +
		"left join fetch direcciones.provincia as provincia ";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}
	
	@SuppressWarnings("unchecked")
	@Transactional
	public Persona findByID(int id){
		
		String hql = "SELECT DISTINCT persona FROM Persona persona "+
		"left join fetch persona.telefonos as telefonos " +
		"left join fetch persona.direcciones as direcciones " +
		"left join fetch direcciones.provincia as provincia " +
		"WHERE persona.id = :idpersona";
		Query query = entityManager.createQuery(hql);
		query.setParameter("idpersona", id);
		
	    return (Persona) query.getSingleResult();
	}
	
}
