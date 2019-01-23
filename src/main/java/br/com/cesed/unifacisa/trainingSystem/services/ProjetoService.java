package br.com.cesed.unifacisa.trainingSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.unifacisa.trainingSystem.domains.Projeto;
import br.com.cesed.unifacisa.trainingSystem.dtos.CadastrarProjeto;
import br.com.cesed.unifacisa.trainingSystem.repositories.ProjetoRepository;

@Service
public class ProjetoService {

	@Autowired
	private ProjetoRepository repository;

	@Autowired
	private AlunoService alunoService;

	public void createProjeto(CadastrarProjeto cadastrarProjeto) {

		Projeto projeto = new Projeto();
		projeto.setDescricao(cadastrarProjeto.getDescricao());
		projeto.setNome(cadastrarProjeto.getNome());

		projeto.getEquipe().addAll(alunoService.findListaAlunos(cadastrarProjeto.getIdsAlunos()));

		repository.save(projeto);
	}

}
