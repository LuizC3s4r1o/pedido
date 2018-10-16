package com.lacsystem.pedido;

import java.math.BigDecimal;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.lacsystem.pedido.domain.Categoria;
import com.lacsystem.pedido.domain.Cidade;
import com.lacsystem.pedido.domain.Cliente;
import com.lacsystem.pedido.domain.Endereco;
import com.lacsystem.pedido.domain.Estado;
import com.lacsystem.pedido.domain.Produto;
import com.lacsystem.pedido.domain.enums.TipoCliente;
import com.lacsystem.pedido.repositories.CategoriaRepository;
import com.lacsystem.pedido.repositories.CidadeRepository;
import com.lacsystem.pedido.repositories.ClienteRepository;
import com.lacsystem.pedido.repositories.EnderecoRepository;
import com.lacsystem.pedido.repositories.EstadoRepository;
import com.lacsystem.pedido.repositories.ProdutoRepository;

@SpringBootApplication
public class PedidoApplication implements CommandLineRunner {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@Autowired
	private CidadeRepository cidadeRepository;
	
	@Autowired
	private EstadoRepository estadoRepository;

	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;

	public static void main(String[] args) {
		SpringApplication.run(PedidoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		List<Produto> listaProdutos = new ArrayList<>();
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		
		Produto p1 = new Produto(null, "Computador", BigDecimal.valueOf(2000.00));
		Produto p2 = new Produto(null, "Impressora", BigDecimal.valueOf(800.00));
		Produto p3 = new Produto(null, "Mouse", BigDecimal.valueOf(85.00));
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2));

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2));
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade cid1 = new Cidade(null, "Uberlândia", est1);
		Cidade cid2 = new Cidade(null, "São Paulo", est2);
		Cidade cid3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2, cid3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		
		Cliente cli1 = new Cliente(null, "José das Coves", "josedascoves@gmail.com", "36378912375", TipoCliente.PESSOAFISICA);
		cli1.getTelefones().addAll(Arrays.asList("45450000","974744747"));
		
		Endereco end1 = new Endereco(null, "Rua das Coves", "1252", "Casa", "Flores", "13136136", cli1, cid1);
		Endereco end2 = new Endereco(null, "Rua das Rosas", "200", "Apto 25", "Centro", "11000111", cli1, cid2);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
		
		clienteRepository.saveAll(Arrays.asList(cli1));
		enderecoRepository.saveAll(Arrays.asList(end1, end2));
		
	}
}
