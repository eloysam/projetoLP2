package com.ifba.projetolp2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ifba.projetolp2.model.Entrada;
import com.ifba.projetolp2.model.Itens_entrada;
import com.ifba.projetolp2.model.Venda;
import com.ifba.projetolp2.service.EntradaService;
import com.ifba.projetolp2.service.ItensEntradaService;
import com.ifba.projetolp2.service.ProdutoService;
import com.ifba.projetolp2.service.VendaService;

@SpringBootApplication
public class Projetolp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetolp2Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(VendaService serVen, ItensEntradaService serItEn, ProdutoService serPro, EntradaService serEnt) {
		return (args) -> {

			Venda v = new Venda();
			v.setId(Long.valueOf(2));
			v.setValorVenda(59.6);
			v.setDataVenda("23/12/23");
			serVen.salvar(v);
<<<<<<< HEAD
			serVen.atualizar(v);
=======
			System.out.println("Listagem das vendas: " + serVen.buscarTodos());
>>>>>>> 6e3afaebe3a148d9313445eca159d2833a792d6c

			Entrada en = new Entrada();
			en.setData("23/10/24");
			en.setId(Long.valueOf(2));
			en.setValor(1200.30);
			serEnt.salvar(en);
			serEnt.atualizar(en);

			Itens_entrada itEn = new Itens_entrada();
			//itEn.setEntrada(null);
			itEn.setId(Long.valueOf(1));
			//itEn.setIdProduto(null);
			itEn.setQuantidade(123);
			itEn.setValorUnitario(12.20);
			serItEn.salvar(itEn);
			serItEn.atualizar(itEn);

<<<<<<< HEAD
			System.out.println(serVen.buscarTodos());

=======
			//System.out.println(serVen.buscarTodos());
>>>>>>> 6e3afaebe3a148d9313445eca159d2833a792d6c
		};
	}

}
