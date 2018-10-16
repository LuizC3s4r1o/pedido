package com.lacsystem.pedido.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lacsystem.pedido.domain.Endereco;

/**
 * @author Luiz.Cesario
 *
 */

@Repository
public interface EnderecoRepository  extends JpaRepository<Endereco, Long>{

}
