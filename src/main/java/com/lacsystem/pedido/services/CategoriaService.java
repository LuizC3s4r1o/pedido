package com.lacsystem.pedido.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.Categoria;
import com.lacsystem.pedido.repositories.CategoriaRepository;
import com.lacsystem.pedido.services.exceptions.ObjectNotFoundException;

/**
 * @author Luiz.Cesario
 *
 */

@Service
public class CategoriaService {
	
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Long id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName(), null));
		}

}
