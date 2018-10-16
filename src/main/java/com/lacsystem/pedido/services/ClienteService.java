package com.lacsystem.pedido.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.Cliente;
import com.lacsystem.pedido.repositories.ClienteRepository;
import com.lacsystem.pedido.services.exceptions.ObjectNotFoundException;

/**
 * @author Luiz.Cesario
 *
 */

@Service
public class ClienteService {
	
	@Autowired
	private ClienteRepository repo;
	
	public Cliente buscar(Long id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Cliente.class.getName(), null));
		}

}
