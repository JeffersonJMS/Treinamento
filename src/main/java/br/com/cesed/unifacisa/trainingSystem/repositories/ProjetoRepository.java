package br.com.cesed.unifacisa.trainingSystem.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesed.unifacisa.trainingSystem.domains.Projeto;

@Repository
public interface ProjetoRepository extends JpaRepository<Projeto, Long> {

}
