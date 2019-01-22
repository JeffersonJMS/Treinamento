package br.com.cesed.unifacisa.trainingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesed.unifacisa.trainingSystem.domains.Turma;

@Repository
public interface TurmaRepository extends JpaRepository<Turma, Long>{

}
