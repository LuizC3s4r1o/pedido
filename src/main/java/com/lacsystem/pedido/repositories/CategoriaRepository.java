package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.Categoria;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface CategoriaRepository  extends JpaRepository<Categoria, Long>{

}
