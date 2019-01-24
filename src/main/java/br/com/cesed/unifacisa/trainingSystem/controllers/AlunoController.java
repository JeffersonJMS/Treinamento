package br.com.cesed.unifacisa.trainingSystem.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import br.com.cesed.unifacisa.trainingSystem.domains.Aluno;
import br.com.cesed.unifacisa.trainingSystem.dtos.CadastrarAluno;
import br.com.cesed.unifacisa.trainingSystem.services.AlunoService;

@Controller
@RequestMapping("aluno")
public class AlunoController {

	@Autowired
	private AlunoService alunoService;
	
	@PostMapping("novo")
	public ResponseEntity<Aluno> createALuno(@RequestBody CadastrarAluno aluno) throws Exception{
		
			alunoService.createAluno(aluno);
		
		return new ResponseEntity<>(HttpStatus.CREATED);
	}
	
	@GetMapping("todos")
	public ResponseEntity<List<Aluno>> findAll(){
		return new ResponseEntity<List<Aluno>>(alunoService.findAll(), HttpStatus.OK);
	}
	
	@GetMapping("periodo")
	public ResponseEntity<Aluno> findByNomeAndPeriodo(@RequestParam String nome){
		return new ResponseEntity<Aluno>(alunoService.findByNomeAndPeriodo(nome), HttpStatus.OK);
	}
	
}
