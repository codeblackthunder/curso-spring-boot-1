package com.carro.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController // metodo pra mapear como um web server
@RequestMapping("/") // indica o que deve digitar na url para acessar esse web server
public class IndexController {

	//browser sempre cai no get
	
	@GetMapping //pega o mapeamento da /
	public String get() {
		return "olá spring boot";
	}
	
	@PostMapping("/login")
	public String login(@RequestParam("login")String login,@RequestParam("senha")String senha) {
		return"login :"+login+" senha: "+senha;

		//testar via postman
		/*
		 *  1 - Marcar do tipo post
		 *  2 - body
		 *  3 - x-www-form.....
		 *  4 - settar os campos
		 *  5 - send
		 *  
		 *  
		 *  */
		
	}
	
}
