package com.bispo.showmilhao.domain.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.bispo.showmilhao.domain.model.Participante;

public interface ParticipanteRepository extends JpaRepository<Participante, Long> {
	
	@Query("SELECT p FROM Participante p WHERE p.nome like :nome")
	List<Participante> findByNameContaining(@Param("nome") String nome);	
	
}
