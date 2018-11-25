package com.lacsystem.pedido.services;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.lacsystem.pedido.domain.Categoria;
import com.lacsystem.pedido.domain.Cidade;
import com.lacsystem.pedido.domain.Cliente;
import com.lacsystem.pedido.domain.Endereco;
import com.lacsystem.pedido.domain.Estado;
import com.lacsystem.pedido.domain.ItemPedido;
import com.lacsystem.pedido.domain.Pagamento;
import com.lacsystem.pedido.domain.PagamentoComBoleto;
import com.lacsystem.pedido.domain.PagamentoComCartao;
import com.lacsystem.pedido.domain.Pedido;
import com.lacsystem.pedido.domain.Produto;
import com.lacsystem.pedido.domain.enums.EstadoPagamento;
import com.lacsystem.pedido.domain.enums.Perfil;
import com.lacsystem.pedido.domain.enums.TipoCliente;
import com.lacsystem.pedido.repositories.CategoriaRepository;
import com.lacsystem.pedido.repositories.CidadeRepository;
import com.lacsystem.pedido.repositories.ClienteRepository;
import com.lacsystem.pedido.repositories.EnderecoRepository;
import com.lacsystem.pedido.repositories.EstadoRepository;
import com.lacsystem.pedido.repositories.ItemPedidoRepository;
import com.lacsystem.pedido.repositories.PagamentoRepository;
import com.lacsystem.pedido.repositories.PedidoRepository;
import com.lacsystem.pedido.repositories.ProdutoRepository;

/**
 * @author Luiz.Cesario
 *
 */

@Service
public class DbService {
	
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
	
	@Autowired
	private PedidoRepository pedidoRepository;
	
	@Autowired
	private PagamentoRepository pagamentoRepository;
	
	@Autowired
	private ItemPedidoRepository itemPedidoRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCrypt;
	
	public void instantiateTestDataBase() {
		
		Categoria cat1 = new Categoria(null, "Informática");
		Categoria cat2 = new Categoria(null, "Escritório");
		Categoria cat3 = new Categoria(null, "Cama mesa e banho");
		Categoria cat4 = new Categoria(null, "Eletrônicos");
		Categoria cat5 = new Categoria(null, "Tecnologia");
		Categoria cat6 = new Categoria(null, "Decoração");
		Categoria cat7 = new Categoria(null, "Jardinagem");
		Categoria cat8 = new Categoria(null, "Lazer");
		Categoria cat9 = new Categoria(null, "Perfumaria");
		Categoria cat10 = new Categoria(null, "Móveis");
		
		Produto p1 = new Produto(null, "Computador", BigDecimal.valueOf(2000.00));
		Produto p2 = new Produto(null, "Impressora", BigDecimal.valueOf(800.00));
		Produto p3 = new Produto(null, "Mouse", BigDecimal.valueOf(85.00));
		Produto p4 = new Produto(null, "Mesa de escritorio", BigDecimal.valueOf(300.00));
		Produto p5 = new Produto(null, "Toalha", BigDecimal.valueOf(30.00));
		Produto p6 = new Produto(null, "Colcha", BigDecimal.valueOf(185.00));
		Produto p7 = new Produto(null, "TV true color", BigDecimal.valueOf(1285.00));
		Produto p8 = new Produto(null, "Tesoura", BigDecimal.valueOf(70.00));
		Produto p9 = new Produto(null, "Mesa de sinuca", BigDecimal.valueOf(3800.00));
		Produto p10 = new Produto(null, "Abajur", BigDecimal.valueOf(95.00));
		Produto p11 = new Produto(null, "Shampoo", BigDecimal.valueOf(73.00));
		Produto p12 = new Produto(null, "Produto 12", BigDecimal.valueOf(11.00));
		Produto p13 = new Produto(null, "Produto 13", BigDecimal.valueOf(11.00));
		Produto p14 = new Produto(null, "Produto 14", BigDecimal.valueOf(11.00));
		Produto p15 = new Produto(null, "Produto 15", BigDecimal.valueOf(11.00));
		Produto p16 = new Produto(null, "Produto 16", BigDecimal.valueOf(11.00));
		Produto p17 = new Produto(null, "Produto 17", BigDecimal.valueOf(11.00));
		Produto p18 = new Produto(null, "Produto 18", BigDecimal.valueOf(11.00));
		Produto p19 = new Produto(null, "Produto 19", BigDecimal.valueOf(11.00));
		Produto p20 = new Produto(null, "Produto 20", BigDecimal.valueOf(11.00));
		Produto p21 = new Produto(null, "Produto 21", BigDecimal.valueOf(11.00));
		Produto p22 = new Produto(null, "Produto 22", BigDecimal.valueOf(11.00));
		Produto p23 = new Produto(null, "Produto 23", BigDecimal.valueOf(11.00));
		Produto p24 = new Produto(null, "Produto 24", BigDecimal.valueOf(11.00));
		Produto p25 = new Produto(null, "Produto 25", BigDecimal.valueOf(11.00));
		Produto p26 = new Produto(null, "Produto 26", BigDecimal.valueOf(11.00));
		Produto p27 = new Produto(null, "Produto 27", BigDecimal.valueOf(11.00));
		Produto p28 = new Produto(null, "Produto 28", BigDecimal.valueOf(11.00));
		Produto p29 = new Produto(null, "Produto 29", BigDecimal.valueOf(11.00));
		Produto p30 = new Produto(null, "Produto 30", BigDecimal.valueOf(11.00));
		Produto p31 = new Produto(null, "Produto 31", BigDecimal.valueOf(11.00));
		Produto p32 = new Produto(null, "Produto 32", BigDecimal.valueOf(11.00));
		Produto p33 = new Produto(null, "Produto 33", BigDecimal.valueOf(11.00));
		Produto p34 = new Produto(null, "Produto 34", BigDecimal.valueOf(11.00));
		Produto p35 = new Produto(null, "Produto 35", BigDecimal.valueOf(11.00));
		Produto p36 = new Produto(null, "Produto 36", BigDecimal.valueOf(11.00));
		Produto p37 = new Produto(null, "Produto 37", BigDecimal.valueOf(11.00));
		Produto p38 = new Produto(null, "Produto 38", BigDecimal.valueOf(11.00));
		Produto p39 = new Produto(null, "Produto 39", BigDecimal.valueOf(11.00));
		Produto p40 = new Produto(null, "Produto 40", BigDecimal.valueOf(11.00));
		Produto p41 = new Produto(null, "Produto 41", BigDecimal.valueOf(11.00));
		Produto p42 = new Produto(null, "Produto 42", BigDecimal.valueOf(11.00));
		Produto p43 = new Produto(null, "Produto 43", BigDecimal.valueOf(11.00));
		Produto p44 = new Produto(null, "Produto 44", BigDecimal.valueOf(11.00));
		Produto p45 = new Produto(null, "Produto 45", BigDecimal.valueOf(11.00));
		Produto p46 = new Produto(null, "Produto 46", BigDecimal.valueOf(11.00));
		Produto p47 = new Produto(null, "Produto 47", BigDecimal.valueOf(11.00));
		Produto p48 = new Produto(null, "Produto 48", BigDecimal.valueOf(11.00));
		Produto p49 = new Produto(null, "Produto 49", BigDecimal.valueOf(11.00));
		Produto p50 = new Produto(null, "Produto 50", BigDecimal.valueOf(11.00));
		
		
		
		cat1.getProdutos().addAll(Arrays.asList(p1,p2,p3));
		cat2.getProdutos().addAll(Arrays.asList(p2,p4));
		cat3.getProdutos().addAll(Arrays.asList(p5,p6));
		cat4.getProdutos().addAll(Arrays.asList(p7));
		cat5.getProdutos().addAll(Arrays.asList(p7));
		cat6.getProdutos().addAll(Arrays.asList(p10));
		cat7.getProdutos().addAll(Arrays.asList(p8));
		cat8.getProdutos().addAll(Arrays.asList(p9));
		cat9.getProdutos().addAll(Arrays.asList(p11));
		cat10.getProdutos().addAll(Arrays.asList(p9,p10));
		cat1.getProdutos().addAll(Arrays.asList(p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
				

		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1, cat2));
		p3.getCategorias().addAll(Arrays.asList(cat1));
		p4.getCategorias().addAll(Arrays.asList(cat2));
		p5.getCategorias().addAll(Arrays.asList(cat3));
		p6.getCategorias().addAll(Arrays.asList(cat3));
		p7.getCategorias().addAll(Arrays.asList(cat4,cat5));
		p8.getCategorias().addAll(Arrays.asList(cat7));
		p9.getCategorias().addAll(Arrays.asList(cat8));
		p10.getCategorias().addAll(Arrays.asList(cat6,cat10));
		p11.getCategorias().addAll(Arrays.asList(cat9));
		p12.getCategorias().addAll(Arrays.asList(cat1));
		p13.getCategorias().addAll(Arrays.asList(cat1));
		p14.getCategorias().addAll(Arrays.asList(cat1));
		p15.getCategorias().addAll(Arrays.asList(cat1));
		p16.getCategorias().addAll(Arrays.asList(cat1));
		p17.getCategorias().addAll(Arrays.asList(cat1));
		p18.getCategorias().addAll(Arrays.asList(cat1));
		p19.getCategorias().addAll(Arrays.asList(cat1));
		p20.getCategorias().addAll(Arrays.asList(cat1));
		p21.getCategorias().addAll(Arrays.asList(cat1));
		p22.getCategorias().addAll(Arrays.asList(cat1));
		p23.getCategorias().addAll(Arrays.asList(cat1));
		p24.getCategorias().addAll(Arrays.asList(cat1));
		p25.getCategorias().addAll(Arrays.asList(cat1));
		p26.getCategorias().addAll(Arrays.asList(cat1));
		p27.getCategorias().addAll(Arrays.asList(cat1));
		p28.getCategorias().addAll(Arrays.asList(cat1));
		p29.getCategorias().addAll(Arrays.asList(cat1));
		p30.getCategorias().addAll(Arrays.asList(cat1));
		p31.getCategorias().addAll(Arrays.asList(cat1));
		p32.getCategorias().addAll(Arrays.asList(cat1));
		p33.getCategorias().addAll(Arrays.asList(cat1));
		p34.getCategorias().addAll(Arrays.asList(cat1));
		p35.getCategorias().addAll(Arrays.asList(cat1));
		p36.getCategorias().addAll(Arrays.asList(cat1));
		p37.getCategorias().addAll(Arrays.asList(cat1));
		p38.getCategorias().addAll(Arrays.asList(cat1));
		p39.getCategorias().addAll(Arrays.asList(cat1));
		p40.getCategorias().addAll(Arrays.asList(cat1));
		p41.getCategorias().addAll(Arrays.asList(cat1));
		p42.getCategorias().addAll(Arrays.asList(cat1));
		p43.getCategorias().addAll(Arrays.asList(cat1));
		p44.getCategorias().addAll(Arrays.asList(cat1));
		p45.getCategorias().addAll(Arrays.asList(cat1));
		p46.getCategorias().addAll(Arrays.asList(cat1));
		p47.getCategorias().addAll(Arrays.asList(cat1));
		p48.getCategorias().addAll(Arrays.asList(cat1));
		p49.getCategorias().addAll(Arrays.asList(cat1));
		p50.getCategorias().addAll(Arrays.asList(cat1));
		
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2, cat3, cat4, cat5, cat6, cat7, cat8, cat9, cat10));
		
		produtoRepository.saveAll(Arrays.asList(p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20,
				p21, p22, p23, p24, p25, p26, p27, p28, p29, p30, p31, p32, p34, p35, p36, p37, p38,
				p39, p40, p41, p42, p43, p44, p45, p46, p47, p48, p49, p50));
		
		Estado est1 = new Estado(null, "Minas Gerais");
		Estado est2 = new Estado(null, "São Paulo");
		
		Cidade cid1 = new Cidade(null, "Uberlândia", est1);
		Cidade cid2 = new Cidade(null, "São Paulo", est2);
		Cidade cid3 = new Cidade(null, "Campinas", est2);
		
		est1.getCidades().addAll(Arrays.asList(cid1));
		est2.getCidades().addAll(Arrays.asList(cid2, cid3));
		
		estadoRepository.saveAll(Arrays.asList(est1, est2));
		cidadeRepository.saveAll(Arrays.asList(cid1, cid2, cid3));
		
		Cliente cli1 = new Cliente(null, "José das Coves", "luiz.cesario@yahoo.com.br", "36378912375", TipoCliente.PESSOAFISICA, bCrypt.encode("2018@"));
		cli1.getTelefones().addAll(Arrays.asList("45450000","974744747"));
		
		Cliente cli2 = new Cliente(null, "Maria Regina", "luiz.c3s4r1o@gmail.com", "32902428030", TipoCliente.PESSOAFISICA, bCrypt.encode("2018@"));
		cli2.getTelefones().addAll(Arrays.asList("45450020","985748547"));
		cli2.addPerfil(Perfil.ADMIN);
		
		Endereco end1 = new Endereco(null, "Rua das Coves", "1252", "Casa", "Flores", "13136136", cli1, cid1);
		Endereco end2 = new Endereco(null, "Rua das Rosas", "200", "Apto 25", "Centro", "11000111", cli1, cid2);
		Endereco end3 = new Endereco(null, "Rua das Chuva", "17", "Chacara", "Sitio pinhal", "15000111", cli2, cid3);
		
		cli1.getEnderecos().addAll(Arrays.asList(end1, end2));
		cli2.getEnderecos().addAll(Arrays.asList(end3));
		
		clienteRepository.saveAll(Arrays.asList(cli1, cli2));
		enderecoRepository.saveAll(Arrays.asList(end1, end2, end3));
		
		Pedido ped1 = new Pedido(null, LocalDateTime.now(), cli1, end1);
		Pedido ped2 = new Pedido(null, LocalDateTime.now().minusDays(5).minusHours(3), cli1, end2);
		
		Pagamento pgto1 = new PagamentoComCartao(null, EstadoPagamento.QUITADO, ped1, 6);
		ped1.setPagamento(pgto1);
		
		Pagamento pgto2 = new PagamentoComBoleto(null, EstadoPagamento.PENDENTE, ped2, LocalDate.now().minusMonths(13), null);
		ped2.setPagamento(pgto2);
		
		cli1.getPedidos().addAll(Arrays.asList(ped1, ped2));
		
		pedidoRepository.saveAll(Arrays.asList(ped1, ped2));
		
		pagamentoRepository.saveAll(Arrays.asList(pgto1, pgto2));
		
		ItemPedido itPed1 = new ItemPedido(ped1, p1, BigDecimal.valueOf(0.00), 1, BigDecimal.valueOf(2000.00));
		ItemPedido itPed2 = new ItemPedido(ped1, p3, BigDecimal.valueOf(0.00), 2, BigDecimal.valueOf(80.00));
		ItemPedido itPed3 = new ItemPedido(ped2, p2, BigDecimal.valueOf(100.00), 1, BigDecimal.valueOf(800.00));
		
		ped1.getItens().addAll(Arrays.asList(itPed1, itPed2));
		ped1.getItens().addAll(Arrays.asList(itPed3));
		
		p1.getItens().addAll(Arrays.asList(itPed1));
		p2.getItens().addAll(Arrays.asList(itPed3));
		p3.getItens().addAll(Arrays.asList(itPed2));
		
		itemPedidoRepository.saveAll(Arrays.asList(itPed1, itPed2, itPed3));
		
	}

}
