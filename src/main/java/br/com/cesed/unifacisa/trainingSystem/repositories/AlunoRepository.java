package br.com.cesed.unifacisa.trainingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesed.unifacisa.trainingSystem.domains.Aluno;

@Repository
public interface AlunoRepository extends JpaRepository<Aluno, Long> {

	Aluno findByNome(String nome);
	
}
