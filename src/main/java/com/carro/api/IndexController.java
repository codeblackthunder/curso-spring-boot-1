package com.carro.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // metodo pra mapear como um web server
@RequestMapping("/") // indica o que deve digitar na url para acessar esse web server
public class IndexController {

	@GetMapping //pega o mapeamento da /
	public String ola() {
		return "olá spring boot";
	}
	
	@GetMapping("/tiau") //para não ter um mesmo web server com o mesmo mapeamento é necessario indicar nova rota
	public String tiau() {
		return "tiau spring boot";
	}
	
}
