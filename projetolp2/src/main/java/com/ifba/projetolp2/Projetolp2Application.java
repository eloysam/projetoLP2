package com.ifba.projetolp2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import com.ifba.projetolp2.model.Venda;
import com.ifba.projetolp2.repository.IVendaRepository;

@SpringBootApplication
public class Projetolp2Application {

	public static void main(String[] args) {
		SpringApplication.run(Projetolp2Application.class, args);
	}

	@Bean
	public CommandLineRunner demo(IVendaRepository repVen) {
		return (args) -> {

			Venda v = new Venda();
			v.setId(Long.valueOf(1));
			v.setIdVendedor(Long.valueOf(3));
			v.setValorVenda(59.6);
			v.setDataVenda("23/12/23");
			//v.setVendaItens("shampoo", "sabonete");
			repVen.save(v);

			System.out.println(repVen.findAll());


		};
	}

}
