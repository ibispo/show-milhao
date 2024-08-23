package com.bispo.showmilhao.api.controller;

import java.util.Optional;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bispo.showmilhao.domain.model.Questao;
import com.bispo.showmilhao.domain.repository.QuestaoRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/questao")
public class QuestaoController {

	private QuestaoRepository questaoRepository;
	
	@GetMapping("/ola")
	public String helloWorld() {
		return "Welcome to Million Show. Here, you don't gain anything, but knowledge, witch has more value than money.";
	}	
	
	@GetMapping("/{questaoId}")
	public ResponseEntity<Questao> obter(@PathVariable(name = "questaoId") Long id) {
		
		Optional<Questao> questaoOp = questaoRepository.findById(id);
		
		return questaoOp
				.map(ResponseEntity::ok)                
				.orElse(ResponseEntity.notFound().build());
	}	
	
}
