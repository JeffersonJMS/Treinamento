package br.com.cesed.unifacisa.trainingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesed.unifacisa.trainingSystem.domains.Habilidade;
import br.com.cesed.unifacisa.trainingSystem.services.HabilidadeService;

@Controller
@RequestMapping("habilidades")
public class HabilidadeController {

	@Autowired
	private HabilidadeService habilidadeService;
	
	@GetMapping(path = "{id}")
	public ResponseEntity<Habilidade> readHabilidade(@PathVariable(name = "id") Long id) {
		return new ResponseEntity<Habilidade>(habilidadeService.readHabilidade(id), HttpStatus.OK);
	}

	@PostMapping("novo")
	public ResponseEntity<Habilidade> createHabilidade(@RequestBody Habilidade habilidade) {
		habilidadeService.createHabilidade(habilidade);
		return new ResponseEntity<>(HttpStatus.CREATED);
	}

	@PutMapping("atualizacao")
	public ResponseEntity<Habilidade> updatehablidade(@RequestBody Habilidade habilidade) {
		habilidadeService.updateHabilidade(habilidade);
		return new ResponseEntity<Habilidade>(HttpStatus.OK);
	}

	@GetMapping("todas")
	public ResponseEntity<List<Habilidade>> readAll() {
		return new ResponseEntity<List<Habilidade>>(habilidadeService.readAll(), HttpStatus.OK);
	}
	
	@DeleteMapping("/{id}/exclusao")
	public ResponseEntity<Habilidade> deleteHabilidade(@PathVariable(name = "id") Long id){
		habilidadeService.deleteHabilidade(id);
		return new ResponseEntity<Habilidade>(HttpStatus.OK);
	}
}
