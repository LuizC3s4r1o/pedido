package com.lacsystem.pedido.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lacsystem.pedido.services.DbService;
import com.lacsystem.pedido.services.EmailService;
import com.lacsystem.pedido.services.SmtpEmailService;

/**
 * @author Luiz.Cesario
 *
 */

@Configuration
@Profile("prod")
public class ProdConfig {
	
	@Autowired
	private DbService dbService;
	
	@Value("${spring.jpa.hibernate.ddl-auto}")
	private String strategy;

	@Bean
	public boolean instantiateDataBase() {
		
		if(!"create".equals(strategy)) {
			return false;
		}
		
		dbService.instantiateTestDataBase();
		return true;
	}
	
	@Bean
	public EmailService emailService() {
		return new SmtpEmailService();
	}
}
