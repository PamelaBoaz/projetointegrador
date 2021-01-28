package com.raizagro.raizAgro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.raizagro.raizAgro.model.Postagem;
import com.raizagro.raizAgro.repository.PostagemRepository;

@RestController
@RequestMapping("/postagem")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class PostagemController {

	@Autowired
	private PostagemRepository repository;

	@GetMapping
	public ResponseEntity<List<Postagem>> findAllPostagem() {
		return ResponseEntity.ok(repository.findAll());

	}

	@GetMapping("/{id}")
	public ResponseEntity<Postagem> findById(@PathVariable Long id) {
		return repository.findById(id).map(resp -> ResponseEntity.ok(resp)).orElse(ResponseEntity.notFound().build());
	}
	
	@GetMapping("/localizacao/{localizacao}")
	public ResponseEntity<List<Postagem>> findByLocalizacao(@PathVariable String localizacao) {
		return ResponseEntity.ok(repository.findAllByLocalizacaoContainingIgnoreCase(localizacao));
	}
	
	@GetMapping("/contato/{contato}")
	public ResponseEntity<List<Postagem>> findByContato(@PathVariable String contato) {
		return ResponseEntity.ok(repository.findByContatoContainingIgnoreCase(contato));	
	}	

	@PostMapping
	public ResponseEntity<Postagem> post(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(postagem));
	}

	@PutMapping
	public ResponseEntity<Postagem> put(@RequestBody Postagem postagem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(postagem));
	}

	@DeleteMapping("/{id}")
	public void delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
