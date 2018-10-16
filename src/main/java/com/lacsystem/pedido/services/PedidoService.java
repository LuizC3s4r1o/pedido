package com.lacsystem.pedido.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.Pedido;
import com.lacsystem.pedido.repositories.PedidoRepository;
import com.lacsystem.pedido.services.exceptions.ObjectNotFoundException;

/**
 * @author Luiz.Cesario
 *
 */

@Service
public class PedidoService {
	
	@Autowired
	private PedidoRepository repo;
	
	public Pedido buscar(Long id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
		"Objeto não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName(), null));
		}

}
