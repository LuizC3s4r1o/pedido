package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.Estado;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface EstadoRepository  extends JpaRepository<Estado, Long>{

}
