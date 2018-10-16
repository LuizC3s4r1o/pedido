package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.Pedido;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface PedidoRepository  extends JpaRepository<Pedido, Long>{

}
