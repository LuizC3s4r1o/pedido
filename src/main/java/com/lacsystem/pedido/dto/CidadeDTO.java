/**
 * 
 */
package com.lacsystem.pedido.dto;

import java.io.Serializable;

import com.lacsystem.pedido.domain.Cidade;

/**
 * @author Luiz.Cesario
 *
 */
public class CidadeDTO implements Serializable {
	private static final long serialVersionUID = 1L;
	
	private Long id;
	private String nome;
	

	public CidadeDTO() {
	}

	public CidadeDTO(Cidade obj) {
		id = obj.getId();
		nome = obj.getNome();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
