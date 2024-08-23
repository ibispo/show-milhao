package com.bispo.showmilhao.domain.model;

import java.util.Set;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;
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
public class Questao {

	@Column(name = "questao_id")
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank
	@Size(max = 100)
	private String descricao;
	
	@Enumerated(EnumType.ORDINAL)
	@NotNull
	private QuestaoGrauEnum grau;
	
	@NotNull
	// @OneToMany(orphanRemoval = true, cascade = CascadeType.ALL, mappedBy = "questao")
	@OneToMany(orphanRemoval=true)
    @JoinColumn(name="questao_id")
	private Set<QuestaoResposta> questaoRespostaList;
	
}
