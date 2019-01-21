package br.com.cesed.unifacisa.trainingSystem.domains;

import java.util.ArrayList;
import java.util.List;

public class Turma {

	private String nome;
	
	private String descricao;
	
	private String area;
	
	private List<Projeto> projetos = new ArrayList<Projeto>();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public List<Projeto> getProntuarios() {
		return projetos;
	}

	public void setProntuarios(List<Projeto> projetos) {
		this.projetos = projetos;
	}

	public String getArea() {
		return area;
	}

	public void setArea(String area) {
		this.area = area;
	}
	
}
