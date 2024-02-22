package com.example.demo.repository;

import javax.persistence.EntityManager;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;

import com.example.demo.repository.modelo.Usuario;

@Transactional
@Repository
public class UsuaraioRepositoryImpl implements IUsuarioRepository{
	
	private EntityManager entityManagert;

	@Override
	public Usuario consultarPorNombre(String nombre) {
		// TODO Auto-generated method stub
		String jpql ="SELECT u FROM Usuario u WHERE u.nombre =: nombre ";
		TypedQuery<Usuario> myQuery = this.entityManagert.createQuery(jpql,Usuario.class);
		myQuery.setParameter("nombre", nombre);
		
		return myQuery.getSingleResult();
	}

}
