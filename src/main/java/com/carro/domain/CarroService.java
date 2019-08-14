package com.carro.domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CarroService {
	@Autowired
	private CarroRepository rep;
	


	
	public Iterable<Carro>getCarros(){
		return rep.findAll();
	}




	public Optional<Carro> getCarroById(Long id) {
		// TODO Auto-generated method stub
		return rep.findById(id);
	}




	public Iterable<Carro> getCarroByTipo(String tipo) {
		// TODO Auto-generated method stub
		return rep.findByTipo(tipo);
	}
	
	
	
}
