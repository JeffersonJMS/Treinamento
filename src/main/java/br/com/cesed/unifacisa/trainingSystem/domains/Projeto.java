package br.com.cesed.unifacisa.trainingSystem.domains;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Projeto {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "projeto_id")
	private Long id;
	
	@Column(name = "projeto_descricao", nullable = false, unique = true)
	private String descricao;

	@Column(name = "projeto_nome" ,unique = true, length = 150)
	private String nome;

	@OneToMany
	@JoinColumn(name = "projeto_id")
	private List<Aluno> equipe = new ArrayList<Aluno>();

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Aluno> getEquipe() {
		return equipe;
	}

	public void setEquipe(List<Aluno> equipe) {
		this.equipe = equipe;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

}
