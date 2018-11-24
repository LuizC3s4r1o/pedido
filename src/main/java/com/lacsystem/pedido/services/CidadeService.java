/**
 * 
 */
package com.lacsystem.pedido.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.Cidade;
import com.lacsystem.pedido.repositories.CidadeRepository;

/**
 * @author Luiz.Cesario
 *
 */
@Service
public class CidadeService {
	
	@Autowired
	private CidadeRepository repo;
	
	public List<Cidade> findByEstado(Long estadoId){
		return repo.findCidades(estadoId);
	}

}
