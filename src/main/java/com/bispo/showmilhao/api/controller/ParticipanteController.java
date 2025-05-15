package com.bispo.showmilhao.api.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.bispo.showmilhao.api.model.ParticipanteDTO;
import com.bispo.showmilhao.domain.model.Participante;
import com.bispo.showmilhao.domain.service.ParticipanteService;

import jakarta.validation.Valid;
import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
@RequestMapping("/participante")
public class ParticipanteController {

	// @Autowired --- Tendo @AllArgsConstructor
	private ParticipanteService participanteService;
		
	@PostMapping("/adicionar")
	@ResponseStatus(code = HttpStatus.CREATED)
	public Participante adicionar(@Valid @RequestBody Participante participante) {
		return participanteService.salvar(participante);
	}	
	
	@GetMapping("/listar")
	public List<Participante> list() {
		return participanteService.listar();
	}

	@GetMapping("/listar-contem")
	public List<Participante> listContains(@RequestBody ParticipanteDTO participantePesquisa) {
		return participanteService.listarPorNomeContem(participantePesquisa.getNome());
	}
	
	public void x() {
		
	}
	
}
