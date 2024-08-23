package com.bispo.showmilhao.domain.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class QuestaoResposta {

	@Column(name = "questao_resposta_id")
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	/*
	@ManyToOne
	@JoinColumn(name="questao_id", nullable = false)
	private Questao questao;
	*/

	@NotNull
	private Short numero;	
	
	@NotBlank
	@Size(max = 50)
	private String descricao;	

	@NotNull
	private Short resposta;	
	
}
