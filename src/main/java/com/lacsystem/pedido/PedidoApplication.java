package com.lacsystem.pedido;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lacsystem.pedido.services.S3Service;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {
	
	@Autowired
	private S3Service s3Service;

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		s3Service.uploadFile("C:\\temp\\images\\lz.png");
	}
}
