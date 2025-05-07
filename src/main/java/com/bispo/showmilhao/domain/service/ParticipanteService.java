package com.bispo.showmilhao.domain.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.bispo.showmilhao.domain.model.Participante;
import com.bispo.showmilhao.domain.repository.ParticipanteRepository;

import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ParticipanteService {
	
	// @Autowired  
	private ParticipanteRepository participanteRepository;
	
	private static final String SQL_LIKE = "%";
	
	@Transactional
	public Participante salvar(Participante participante) {
		return this.participanteRepository.save(participante);
	}

	public List<Participante> listar() {
		return this.participanteRepository.findAll();
	}
	
	public List<Participante> listarPorNomeContem(String nome) {
		return this.participanteRepository.findByNameContaining(SQL_LIKE.concat(nome).concat(SQL_LIKE));
	}
	
	
}
