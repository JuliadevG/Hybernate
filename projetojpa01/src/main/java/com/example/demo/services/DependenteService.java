package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entities.Dependente;
import com.example.demo.repositories.DependenteRepository;

@Service
public class DependenteService {

	@Autowired
	private DependenteRepository dependenteRepository;

	public List<Dependente> getAllDependentes() {
		return dependenteRepository.findAll();
	}

	public Dependente getDependenteById(long depencodigo) {
		return dependenteRepository.findById(depencodigo).orElse(null);
	}

	public Dependente saveDependente(Dependente dependente) {
		return dependenteRepository.save(dependente);
	}

}