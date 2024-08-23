package com.bispo.showmilhao.domain.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bispo.showmilhao.domain.model.Questao;

@Repository
public interface QuestaoRepository extends JpaRepository<Questao, Long> {

	Optional<Questao> findByDescricao(String descricao);
	
}
