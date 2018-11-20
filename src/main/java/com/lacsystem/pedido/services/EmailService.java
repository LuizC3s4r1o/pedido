package com.lacsystem.pedido.services;

import javax.mail.internet.MimeMessage;

import org.springframework.mail.SimpleMailMessage;

import com.lacsystem.pedido.domain.Cliente;
import com.lacsystem.pedido.domain.Pedido;

/**
 * @author Luiz.Cesario
 *
 */

public interface EmailService {
	
	void sendOrderConfirmationEmail(Pedido obj);
	
	void sendEmail(SimpleMailMessage msg);
	
	void sendOrderConfirmationHtmlEmail(Pedido obj);
	
	void sendHtmlEmail(MimeMessage msg);

	void sendNewPasswordEmail(Cliente cliente, String newPassword);

}
