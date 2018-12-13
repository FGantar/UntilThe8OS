package com.beans.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.beans.spring.model.Persona;

/**
 * CLASE CONTACTODAOIMPL Implementacion de la clase ContactoDAO, incluye el
 * codigo principal de los metodos, listaContactos, vistaDetalleContacto,
 * vistaDetalleContacto, altaContacto, modificarContactp, borrarContacto
 * 
 * @author Jhon
 * @version 05/12/2018
 */

@Repository
public class ContactoDAOImpl implements ContactoDAO {

	public ContactoDAOImpl() {

	}

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Persona> listaContactos() {
		String hql = "FROM Persona p ORDER BY p.idPersona";
		return (List<Persona>) entityManager.createQuery(hql).getResultList();
	}

	@Transactional
	@Override
	public Persona vistaDetalleContacto(int id) {
		return entityManager.find(Persona.class, id);
	}

	@Transactional
	@Override
	public Persona altaContacto(Persona persona) {
		entityManager.merge(persona);

		return persona;
	}

	@Transactional
	@Override
	public void modificarContacto(Persona persona) {

		Persona nuevaPersona = vistaDetalleContacto(persona.getIdPersona());
		System.out.println(nuevaPersona);
		nuevaPersona.setNombre(persona.getNombre());
		nuevaPersona.setApellido1(persona.getApellido1());
		nuevaPersona.setApellido2(persona.getApellido2());
		nuevaPersona.setDni(persona.getDni());
		persona.getDirecciones().get(0).setProvincia(nuevaPersona.getDirecciones().get(0).getProvincia());
		persona.getDirecciones().get(0).setIdDireccion(nuevaPersona.getDirecciones().get(0).getIdDireccion());
		persona.getTelefonos().get(0).setIdtelefono(nuevaPersona.getTelefonos().get(0).getIdtelefono());
		;
		nuevaPersona.getDirecciones().clear();

		nuevaPersona.getDirecciones().addAll(persona.getDirecciones());

		nuevaPersona.setFechaNacimiento(persona.getFechaNacimiento());
		nuevaPersona.getTelefonos().clear();
		nuevaPersona.getTelefonos().addAll(persona.getTelefonos());
		System.out.println(nuevaPersona);
		entityManager.merge(nuevaPersona);

	}

	@Transactional
	@Override
	public void borrarContacto(int id) {
		entityManager.remove(vistaDetalleContacto(id));

	}

	@SuppressWarnings("unchecked")
	@Transactional
	@Override
	public List<Persona> Filtrar(String tabla, String columna, String palabra) {
		String hql = "select cat from Persona as cat join cat.direcciones as mate join mate.provincia as kitten where kitten.provincias="
				+ "'" + palabra + "'";
		;
		List<Persona> result = (List<Persona>) entityManager.createQuery(hql).getResultList();

		return result;
	}
}