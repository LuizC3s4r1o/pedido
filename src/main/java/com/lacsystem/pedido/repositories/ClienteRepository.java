package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lacsystem.pedido.domain.Cliente;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface ClienteRepository  extends JpaRepository<Cliente, Long>{
	
	@Transactional(readOnly=true)
	Cliente findByEmail(String email);

}
