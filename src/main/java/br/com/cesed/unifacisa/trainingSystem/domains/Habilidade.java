package br.com.cesed.unifacisa.trainingSystem.domains;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Habilidade {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "habilidade_id")
	private Long id;

	@Column(name = "habilidade_nome", unique = true, nullable = false, length = 20)
	private String nome;

	@Column(name = "habilidade_nivel", nullable = false, length = 2)
	private Integer nivel;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Integer getNivel() {
		return nivel;
	}

	public void setNivel(Integer nivel) {
		this.nivel = nivel;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
