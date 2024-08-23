package com.bispo.showmilhao.domain.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bispo.showmilhao.domain.exception.EntidadeNaoEncontradaException;
import com.bispo.showmilhao.domain.model.Questao;
import com.bispo.showmilhao.domain.repository.QuestaoRepository;

@Service
public class QuestaoService {

	@Autowired
	private QuestaoRepository questaoRepository;
	
	public String buscarQuestaoPorDescricao(String descricao) {
		Optional<Questao> questaoOp = questaoRepository.findByDescricao(descricao); 
		return questaoOp.isPresent() ? questaoOp.get().getDescricao() : null;
	}	
		
	
	public Questao buscar(Long id) {
		return questaoRepository.findById(id)
				.orElseThrow( () -> new EntidadeNaoEncontradaException("Question not found"));
		
	}	
	
}
