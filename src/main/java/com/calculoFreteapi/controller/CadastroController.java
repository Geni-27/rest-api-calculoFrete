package com.calculoFreteapi.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.calculoFreteapi.model.CadastroFrete;
import com.calculoFreteapi.repository.CadastroRepository;

@RestController
@RequestMapping("/cadastroFrete")
public class CadastroController {

	@Autowired
	private CadastroRepository cadastroRepository;
	
	@GetMapping
	public List<CadastroFrete> listar() {
		return cadastroRepository.findAll();
	}
	
	@GetMapping("/cadastroFrete/{id}")
	public CadastroFrete getCadastroFreteById(@PathVariable Long id) {
		return cadastroRepository.getById(id);
	}
	
	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public CadastroFrete salvar(@RequestBody CadastroFrete cadastroFrete) {
		return cadastroRepository.save(cadastroFrete);
	}
	
	
}
