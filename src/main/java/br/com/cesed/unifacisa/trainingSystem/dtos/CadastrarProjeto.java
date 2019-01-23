package br.com.cesed.unifacisa.trainingSystem.dtos;

import java.util.ArrayList;
import java.util.List;

public class CadastrarProjeto {

	private String descricao;
	
	private String nome;
	
	private List<Long> idsAlunos = new ArrayList<>();

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

	public List<Long> getIdsAlunos() {
		return idsAlunos;
	}

	public void setIdsAlunos(List<Long> idsAlunos) {
		this.idsAlunos = idsAlunos;
	}
	
}
