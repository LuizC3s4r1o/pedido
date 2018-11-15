package com.lacsystem.pedido.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.lacsystem.pedido.services.DbService;

/**
 * @author Luiz.Cesario
 *
 */

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DbService dbService;

	@Bean
	public boolean instantiateDataBase() {
		dbService.instantiateTestDataBase();
		return true;
	}
}
