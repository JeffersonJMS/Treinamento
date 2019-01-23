package br.com.cesed.unifacisa.trainingSystem.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.cesed.unifacisa.trainingSystem.domains.Aluno;
import br.com.cesed.unifacisa.trainingSystem.dtos.CadastrarAluno;
import br.com.cesed.unifacisa.trainingSystem.services.AlunoService;

@Controller
@RequestMapping("aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@PostMapping("novo")
	public ResponseEntity<Aluno> createALuno(@RequestBody CadastrarAluno aluno){
		
		try {
			alunoService.createAluno(aluno);
		} catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.BAD_REQUEST);
		}
		
		return new ResponseEntity<>(HttpStatus.CREATED);
		
	}
	
}
