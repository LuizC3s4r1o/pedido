package com.lacsystem.pedido.services;

import java.time.LocalDateTime;

import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.PagamentoComBoleto;

/**
 * @author Luiz.Cesario
 *
 */
@Service
public class BoletoService {
	
	public void preencherPagamentoComBoleto(PagamentoComBoleto pgto, LocalDateTime instante) {
		pgto.setDataVencimento(instante.toLocalDate().plusDays(7));
	}

}
