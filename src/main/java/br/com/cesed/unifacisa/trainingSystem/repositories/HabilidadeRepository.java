package br.com.cesed.unifacisa.trainingSystem.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.cesed.unifacisa.trainingSystem.domains.Habilidade;

@Repository
public interface HabilidadeRepository extends JpaRepository<Habilidade, Long> {

	 List<Habilidade> findByNivel(Integer nivel);
	
}
