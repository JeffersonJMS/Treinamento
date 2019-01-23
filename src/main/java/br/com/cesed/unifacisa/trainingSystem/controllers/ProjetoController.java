package br.com.cesed.unifacisa.trainingSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesed.unifacisa.trainingSystem.domains.Projeto;
import br.com.cesed.unifacisa.trainingSystem.dtos.CadastrarProjeto;
import br.com.cesed.unifacisa.trainingSystem.services.ProjetoService;

@Controller
@RequestMapping("projetos")
public class ProjetoController {

	@Autowired
	private ProjetoService projetoService;

	@PostMapping("novo")
	public ResponseEntity<Projeto> createProjeto(@RequestBody CadastrarProjeto cadastrarProjeto) {
		projetoService.createProjeto(cadastrarProjeto);
		return new ResponseEntity<Projeto>(HttpStatus.CREATED);
	}

}
