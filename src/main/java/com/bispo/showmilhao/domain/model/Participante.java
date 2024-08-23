package com.bispo.showmilhao.domain.model;

import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

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
public class Participante implements Serializable {

	private static final long serialVersionUID = 1L;

	 @EqualsAndHashCode.Include
	 @Id
	 @GeneratedValue(strategy=GenerationType.IDENTITY)
	 private Long id;

	 @NotBlank
	 @Size(max = 60)
	 private String nome;

	 @NotNull
	 private LocalDateTime dataJogo;
	 
	 @NotNull
	 private Short numeroQuestoes;
	 
	 private BigDecimal valorGanho;	
}
