package com.bispo.showmilhao.api.assembler;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.stereotype.Component;

import com.bispo.showmilhao.api.model.ParticipanteDTO;
import com.bispo.showmilhao.domain.model.Participante;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Component
public class ParticipanteAssembler {

	private ModelMapper modelMapper;
	
	public ParticipanteDTO toModel(Participante participante)	{
		return modelMapper.map(participante, ParticipanteDTO.class);
	}
	
	public List<ParticipanteDTO> toCollectionModel(List<Participante> listParticipante) {
		return listParticipante.stream()
			.map(this::toModel)
			.collect(Collectors.toList());
	}
	
}
