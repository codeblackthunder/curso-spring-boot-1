package com.carro.domain;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController 
@RequestMapping("/api/v1/carros") 
public class CarrosController {
@Autowired
CarroService service;
	
	@GetMapping 
	public Iterable<Carro> getCarros() {
		return service.getCarros();
	}
	
	@GetMapping("/{id}") 
	public Optional<Carro> getCarrosById(@PathVariable("id")Long id) {
		return service.getCarroById(id);
	}
		
	}
	

