package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.Pagamento;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface PagamentoRepository  extends JpaRepository<Pagamento, Long>{

}
