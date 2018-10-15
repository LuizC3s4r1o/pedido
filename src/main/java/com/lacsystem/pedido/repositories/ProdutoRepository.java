package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.Produto;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long>{

}
