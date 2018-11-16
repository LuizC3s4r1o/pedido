package com.lacsystem.pedido.services;

import org.springframework.mail.SimpleMailMessage;

import com.lacsystem.pedido.domain.Pedido;

/**
 * @author Luiz.Cesario
 *
 */

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);

}
