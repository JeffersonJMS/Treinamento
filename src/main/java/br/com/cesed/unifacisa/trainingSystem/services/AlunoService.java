package br.com.cesed.unifacisa.trainingSystem.services;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.unifacisa.trainingSystem.domains.Aluno;
import br.com.cesed.unifacisa.trainingSystem.domains.Habilidade;
import br.com.cesed.unifacisa.trainingSystem.dtos.CadastrarAluno;
import br.com.cesed.unifacisa.trainingSystem.repositories.AlunoRepository;

@Service
public class AlunoService {

	@Autowired
	private AlunoRepository alunoRepository;
	
	@Autowired
	private HabilidadeService habilidadeService;

	public void createAluno(CadastrarAluno cadastrarAluno) throws Exception {

		if (cadastrarAluno.getCpf().length() != 11) {
			throw new Exception("cpf invalido");
		}

		Aluno aluno = new Aluno();

		aluno.setCpf(cadastrarAluno.getCpf());
		aluno.setNome(cadastrarAluno.getNome());
		aluno.setPeriodo(cadastrarAluno.getPeriodo());
		aluno.setMatricula(generateMatricula());
		
		aluno.getHabilidades().addAll(habilidadeService.findHabilidades(cadastrarAluno.getHabilidades()));

		alunoRepository.save(aluno);
	}

	public List<Aluno> findListaAlunos(List<Long> idsAlunos) {

		List<Aluno> alunos = new ArrayList<>();
		
		for (Long idAluno : idsAlunos) {
			
			Aluno aluno = alunoRepository.findById(idAluno).get();
			
			alunos.add(aluno);
			
		}
		
		return alunos;
		
		

	}

	private long generateMatricula() {
		return new Date().getTime();
	}
}
