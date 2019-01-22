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
public class Turma {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "turma_id")
	private Long id;

	@Column(name = "nome_turma", unique = true, nullable = false)
	private String nome;

	@Column(name = "descricao_turma", unique = true,nullable = false)
	private String descricao;

	@Column(name= "area_turma", nullable = false)
	private String area;
	
	@OneToMany
	@JoinColumn(name = "turma_id")
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

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public List<Projeto> getProjetos() {
		return projetos;
	}

	public void setProjetos(List<Projeto> projetos) {
		this.projetos = projetos;
	}

}
