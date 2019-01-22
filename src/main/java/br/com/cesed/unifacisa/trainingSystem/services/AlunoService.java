package br.com.cesed.unifacisa.trainingSystem.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.unifacisa.trainingSystem.domains.Aluno;
import br.com.cesed.unifacisa.trainingSystem.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public void createAluno(Aluno aluno) throws Exception {

		if (aluno.getCpf().length() != 11) {
			throw new Exception("cpf invalido");
		}
		alunoRepository.save(aluno);
	}
}
