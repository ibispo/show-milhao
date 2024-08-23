package com.bispo.showmilhao.domain.model;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotNull;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@EqualsAndHashCode(onlyExplicitlyIncluded = true)
@Getter
@Setter
@Entity
public class QuestaoValor {

	@Column(name = "questao_resposta_id")
	@EqualsAndHashCode.Include
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	
	@NotNull
	//@Column(name="numero_questao")
	private Short numeroQuestao;
	
	@Enumerated(EnumType.ORDINAL)
	@NotNull
	private QuestaoGrauEnum grau;
	
	@NotNull
	//@Column(name="valor_acertar")
	private BigDecimal valorAcertar;	
	
	//@Column(name="valor_errar")
	private BigDecimal valorErrar;	
	
	//@Column(name="valor_parar")
	private BigDecimal valorParar;	
	
	
}
