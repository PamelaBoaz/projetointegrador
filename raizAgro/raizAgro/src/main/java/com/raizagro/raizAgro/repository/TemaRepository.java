package com.raizagro.raizAgro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raizagro.raizAgro.model.Tema;

@Repository
public interface TemaRepository extends JpaRepository<Tema, Long>{
	
	//Alterado categoria para Nome
	public List<Tema> findAllByNomeContainingIgnoreCase(String nome);
	
	public List<Tema> findAllByDescricaoContainingIgnoreCase(String descricao);

}
