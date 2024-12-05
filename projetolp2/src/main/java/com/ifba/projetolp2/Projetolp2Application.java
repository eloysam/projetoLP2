package com.ifba.projetolp2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ifba.projetolp2.model.Entrada;
import com.ifba.projetolp2.model.Fornecedor;
import com.ifba.projetolp2.model.Itens_entrada;
import com.ifba.projetolp2.model.Produto;
import com.ifba.projetolp2.model.Usuario;
import com.ifba.projetolp2.model.Venda;
import com.ifba.projetolp2.model.VendaItens;
import com.ifba.projetolp2.service.EntradaService;
import com.ifba.projetolp2.service.FornecedorService;
import com.ifba.projetolp2.service.ItensEntradaService;
import com.ifba.projetolp2.service.ProdutoService;
import com.ifba.projetolp2.service.UsuarioService;
import com.ifba.projetolp2.service.VendaItensService;
import com.ifba.projetolp2.service.VendaService;

@SpringBootApplication
public class Projetolp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetolp2Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(VendaService serVen, ItensEntradaService serItEn, ProdutoService serPro, EntradaService serEnt, FornecedorService serFor, UsuarioService serUs, VendaItensService serVenIt) {
		return (args) -> {

			Fornecedor f = new Fornecedor();
			f.setNome("Loreal");
			f.setTelefone("90836421");
			f.setCnpj("12345678901234");
			f.setEndereco("rua 1");
			serFor.salvar(f);
			// serFor.atualizar(f);
			System.out.println(serEnt.buscarTodos());

			Produto p = new Produto();
			p.setNomeProduto("shampoo Elseve");
			p.setQtdProduto(100);
			p.setCategoria("cabelo");
			p.setDataFabricacao("2019/09/20");
			p.setDataValidade("2021/10/15");
			p.setFornecedor(f);
			serPro.salvar(p);
			// serPro.atualizar(p);
			System.out.println(serPro.buscarTodos());

			Entrada en = new Entrada();
			en.setData("23/10/24");
			//en.setId(Long.valueOf(2));
			en.setValor(1200);
			serEnt.salvar(en);
			//serEnt.atualizar(en);
			//System.out.println(serEnt.buscarTodos());

			Itens_entrada itEn = new Itens_entrada();
			//itEn.setEntrada(null);
			//itEn.setId(Long.valueOf(1));
			//itEn.setIdProduto(null);
			itEn.setProduto(p);
			itEn.setEntrada(en);
			itEn.setQuantidade(123);
			itEn.setValorUnitario(12);
			serItEn.salvar(itEn);
			//serItEn.atualizar(itEn);
			//System.out.println(serItEn.buscarTodos());

			Venda v = new Venda();
			// v.setId(Long.valueOf(2));
			v.setValorVenda(45);
			v.setDataVenda("23/12/23");
			serVen.salvar(v);
			// serVen.atualizar(v);
			//System.out.println(serVen.buscarTodos());

			VendaItens venIt = new VendaItens();
			venIt.setValorUnitario(20);
			venIt.setQuantidade(2);
			venIt.setVenda(v);
			venIt.setProduto(p);
			serVenIt.salvar(venIt);
			//serVenIt.atualizar(venIt);
			//System.out.println(serVenIt.buscarTodos());

			Usuario u = new Usuario();
			u.setNome("João");
			u.setSenha("joão$%123");
			u.setDataCadastro("2018/02/16");
			u.setTipoUsuario("Gerente");
			serUs.salvar(u);
			//serUs.atualizar(u);
			//System.out.println(serUs.buscarTodos());

		};
	}

}
