package com.lacsystem.pedido.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lacsystem.pedido.domain.Cliente;
import com.lacsystem.pedido.services.ClienteService;

/**
 * @author Luiz.Cesario
 *
 */

@RestController
@RequestMapping(value="/clientes")
public class ClienteResource {
	
	@Autowired
	private ClienteService service;
	
	@RequestMapping(value="/{id}", method=RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Long id) {
		Cliente obj = service.buscar(id);
		return ResponseEntity.ok().body(obj);
	}

}
