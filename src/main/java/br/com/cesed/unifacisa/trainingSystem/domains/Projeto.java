package br.com.cesed.unifacisa.trainingSystem.domains;

import java.util.ArrayList;
import java.util.List;

public class Projeto {
	
	private String descricao;
	
	private String nome;
	
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
	
}
