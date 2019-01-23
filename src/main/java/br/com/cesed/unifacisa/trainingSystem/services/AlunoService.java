package br.com.cesed.unifacisa.trainingSystem.services;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.unifacisa.trainingSystem.domains.Aluno;
import br.com.cesed.unifacisa.trainingSystem.dtos.CadastrarAluno;
import br.com.cesed.unifacisa.trainingSystem.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;

	public void createAluno(CadastrarAluno cadastrarAluno) throws Exception {

		if (cadastrarAluno.getCpf().length() != 11) {
			throw new Exception("cpf invalido");
		}
		
		Aluno aluno = new Aluno();
		
		aluno.setCpf(cadastrarAluno.getCpf());
		aluno.setNome(cadastrarAluno.getNome());
		aluno.setPeriodo(cadastrarAluno.getPeriodo());
		
		alunoRepository.save(aluno);
	}
	
	private long generateMatricula() {
		return new Date().getTime();
	}
}
