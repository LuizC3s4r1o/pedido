package com.lacsystem.pedido.domain;

import java.time.LocalDate;

import javax.persistence.Entity;

import com.lacsystem.pedido.domain.enums.EstadoPagamento;

/**
 * @author Luiz.Cesario
 *
 */

@Entity
public class PagamentoComBoleto extends Pagamento {
	private static final long serialVersionUID = 1L;
	
	private LocalDate dataVencimento;
	private LocalDate datapagamento;
	
	public PagamentoComBoleto() {
		
	}

	public PagamentoComBoleto(Long id, EstadoPagamento estado, Pedido pedido, LocalDate dataVencimento, LocalDate datapagamento) {
		super(id, estado, pedido);
		this.dataVencimento = dataVencimento;
		this.datapagamento = datapagamento;
	}

	public LocalDate getDataVencimento() {
		return dataVencimento;
	}

	public void setDataVencimento(LocalDate dataVencimento) {
		this.dataVencimento = dataVencimento;
	}

	public LocalDate getDatapagamento() {
		return datapagamento;
	}

	public void setDatapagamento(LocalDate datapagamento) {
		this.datapagamento = datapagamento;
	}
	
}
