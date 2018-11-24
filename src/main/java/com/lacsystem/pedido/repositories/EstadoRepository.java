package com.lacsystem.pedido.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lacsystem.pedido.domain.Estado;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Long>{
	
	@Transactional(readOnly=true)
	public List<Estado> findAllByOrderByNome();

}
