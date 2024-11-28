package com.ifba.projetolp2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.ifba.projetolp2.model.Entrada;
import com.ifba.projetolp2.model.Itens_entrada;
import com.ifba.projetolp2.model.Venda;
import com.ifba.projetolp2.repository.IEntradaRepository;
import com.ifba.projetolp2.repository.IProdutoRepository;
import com.ifba.projetolp2.repository.IVendaRepository;
import com.ifba.projetolp2.repository.Iitens_entradaRepository;

@SpringBootApplication
public class Projetolp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetolp2Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(IVendaRepository repVen, Iitens_entradaRepository itEnrep, IProdutoRepository proRep, IEntradaRepository entRep) {
		return (args) -> {

			Venda v = new Venda();
			v.setId(Long.valueOf(1));
			v.setIdVendedor(Long.valueOf(3));
			v.setValorVenda(59.6);
			v.setDataVenda("23/12/23");
			repVen.save(v);

			Entrada en = new Entrada();
			en.setData("23/10/24");
			en.setId(Long.valueOf(2));
			en.setValor(1200.30);

			Itens_entrada itEn = new Itens_entrada();
			itEn.setEntrada(null);
			itEn.setId(Long.valueOf(1));
			itEn.setIdProduto(null);
			itEn.setQuantidade(123);
			itEn.setValorUnitario(12.20);
			itEnrep.save(itEn);

			System.out.println(repVen.findAll());


		};
	}

}
