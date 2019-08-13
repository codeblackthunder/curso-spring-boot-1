package com.carro.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController // metodo pra mapear como um web server
@RequestMapping("/") // indica o que deve digitar na url para acessar esse web server
public class IndexController {

	//browser sempre cai no get
	
	@GetMapping //pega o mapeamento da /
	public String get() {
		return "olá spring boot";
	}
	
	@PostMapping //pega o mapeamento da /
	public String post() {
		return "olá spring boot";
	}
	
	@PutMapping //pega o mapeamento da /
	public String put() {
		return "olá spring boot";
	}
	
	@DeleteMapping //pega o mapeamento da /
	public String delete() {
		return "olá spring boot";
	}
	
}
