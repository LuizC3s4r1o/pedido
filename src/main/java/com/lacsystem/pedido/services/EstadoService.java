package com.lacsystem.pedido.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.Estado;
import com.lacsystem.pedido.repositories.EstadoRepository;

/**
 * @author Luiz.Cesario
 *
 */

@Service
public class EstadoService {
	
	@Autowired
	private EstadoRepository repo;
	
	public List<Estado> findAll(){
		return repo.findAllByOrderByNome();
	}

}
