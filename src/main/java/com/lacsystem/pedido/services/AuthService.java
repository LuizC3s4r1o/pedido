package com.lacsystem.pedido.services;

import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.Cliente;
import com.lacsystem.pedido.repositories.ClienteRepository;
import com.lacsystem.pedido.services.exceptions.ObjectNotFoundException;

/**
 * @author Luiz.Cesario
 *
 */

@Service
public class AuthService {
	
	@Autowired
	private ClienteRepository clienteRepository; 
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;
	
	@Autowired
	private EmailService emailService;
	
	private Random random = new Random();
	
	public void sendNewPassword(String email) {
		
		Cliente cliente = clienteRepository.findByEmail(email);
		if(cliente == null) {
			throw new ObjectNotFoundException("Email não econtrado");
		}
		
		String newPassword = newPassword();
		cliente.setSenha(bCryptPasswordEncoder.encode(newPassword));
		
		clienteRepository.save(cliente);
		emailService.sendNewPasswordEmail(cliente, newPassword);
		
	}

	private String newPassword() {
		char[] vet = new char[15];
		for (int i = 0; i < 15; i++) {
			vet[i] = randomChar();
		}
		return new String(vet);
	}

	private char randomChar() {
		int opt = random.nextInt(4);
		if (opt == 0) { // gera digito
			return (char) (random.nextInt(10) + 48);
		} else if (opt == 1) { // gera letra Maiscula
			return (char) (random.nextInt(26) + 65);
		} else if (opt == 2) { // gera caracteres especiais
			return (char) (random.nextInt(11) + 33);
		} else { // gera letra minuscula
			return (char) (random.nextInt(10) + 97);
		}
	}

}
