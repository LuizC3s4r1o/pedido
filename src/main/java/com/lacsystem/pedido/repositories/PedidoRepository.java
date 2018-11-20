package com.lacsystem.pedido.repositories;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lacsystem.pedido.domain.Cliente;
import com.lacsystem.pedido.domain.Pedido;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Long>{
	
	@Transactional(readOnly=true)
	Page<Pedido> findByCliente(Cliente cliente, Pageable pageRequest);

}
