package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.ItemPedido;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface ItemPedidoRepository  extends JpaRepository<ItemPedido, Long>{

}
