package com.carro.api;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
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
	
	@GetMapping("/login")
	public String login(@RequestParam("login")String login,@RequestParam("senha")String senha) {
		return"login :"+login+" senha: "+senha;
		//url completa = http://localhost:8080/login?login=felipe&senha=123 
		
		//http://localhost:8080/login // /login mapeado
		//? indica que vai ser passado valores via get
		//login=felipe popula felipe no parametro login
		//& indica que vou passar outro parametro
		//senha=123 popula o valor da senha
	}
	
}
