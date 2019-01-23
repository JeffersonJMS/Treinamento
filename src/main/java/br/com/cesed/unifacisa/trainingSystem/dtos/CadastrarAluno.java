package br.com.cesed.unifacisa.trainingSystem.dtos;

import java.io.Serializable;

public class CadastrarAluno implements Serializable {

	private static final long serialVersionUID = -3906471640319955626L;

	private String nome;
	
	private String cpf;
	
	private Integer Periodo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Integer getPeriodo() {
		return Periodo;
	}

	public void setPeriodo(Integer periodo) {
		Periodo = periodo;
	}
}
