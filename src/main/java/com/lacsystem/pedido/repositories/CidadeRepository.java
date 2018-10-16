package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.Cidade;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface CidadeRepository  extends JpaRepository<Cidade, Long>{

}
