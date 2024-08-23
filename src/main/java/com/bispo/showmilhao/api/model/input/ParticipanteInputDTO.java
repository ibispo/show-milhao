package com.bispo.showmilhao.api.model.input;

import jakarta.validation.constraints.NotBlank;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ParticipanteInputDTO {

	@NotBlank
	private String nome;
	
}
