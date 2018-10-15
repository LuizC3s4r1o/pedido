package com.lacsystem.pedido;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lacsystem.pedido.domain.Categoria;
import com.lacsystem.pedido.repositories.CategoriaRepository;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		List<Categoria> lista = new ArrayList<>();
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		lista.add(cat1);
		lista.add(cat2);
		
		categoriaRepository.saveAll(lista);
		
	}
}
