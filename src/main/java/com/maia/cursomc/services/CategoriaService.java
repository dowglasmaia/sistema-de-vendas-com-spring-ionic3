package com.maia.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.maia.cursomc.domain.Categoria;
import com.maia.cursomc.repositores.CategoriaRepository;

@Service
public class CategoriaService {

	@Autowired // instanciando o Categoria Service
	private CategoriaRepository repository;

	// metodo para BusarPor ID com SpringDataJPA
	public Optional<Categoria> busbar(Integer id) {
		Optional<Categoria> cat = repository.findById(id);
		return cat;
	}

}
