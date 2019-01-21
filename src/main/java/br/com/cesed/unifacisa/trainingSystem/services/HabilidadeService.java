package br.com.cesed.unifacisa.trainingSystem.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.cesed.unifacisa.trainingSystem.domains.Habilidade;
import br.com.cesed.unifacisa.trainingSystem.repositories.HabilidadeRepository;

@Service
public class HabilidadeService {

	@Autowired
	private HabilidadeRepository habilidadeRepository;

	public void createHabilidade(Habilidade habilidade) {

		habilidadeRepository.save(habilidade);
	}

	public Habilidade readHabilidade(Long id) {
		return habilidadeRepository.findById(id).get();
	}
	
	public List<Habilidade> readAll(){
		return habilidadeRepository.findAll();
	}
	
	public void updateHabilidade(Habilidade habilidade) {
		 habilidadeRepository.save(habilidade);
	}
	
	public void deleteHabilidade(Long id) {
		habilidadeRepository.deleteById(id);
	}

	public List<Habilidade> findByNivel(Integer nivel){
		return habilidadeRepository.findByNivel(nivel);
	}
	
}
