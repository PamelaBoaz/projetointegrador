package com.raizagro.raizAgro.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.raizagro.raizAgro.model.Postagem;

@Repository
public interface PostagemRepository extends JpaRepository<Postagem, Long> {
	
	public List<Postagem> findAllByLocalizacaoContainingIgnoreCase (String localizacao);
	
	public List<Postagem> findByMaduroIs (boolean maduro);

}	
