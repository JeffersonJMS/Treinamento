package br.com.cesed.unifacisa.trainingSystem.domains;

public class Aluno {

	private String nome;
	
	private long matricula;
	
	private byte periodo;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public long getMatricula() {
		return matricula;
	}

	public void setMatricula(long matricula) {
		this.matricula = matricula;
	}

	public byte getPeriodo() {
		return periodo;
	}

	public void setPeriodo(byte periodo) {
		this.periodo = periodo;
	}
	
}
