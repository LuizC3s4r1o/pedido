package com.lacsystem.pedido.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lacsystem.pedido.domain.Cidade;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface CidadeRepository  extends JpaRepository<Cidade, Long>{

	@Transactional(readOnly=true)
	@Query("SELECT obj FROM Cidade obj WHERE obj.estado.id = :estadoId ORDER BY obj.nome")
	public List<Cidade> findCidades(@Param("estadoId") Long estado_id);
}
