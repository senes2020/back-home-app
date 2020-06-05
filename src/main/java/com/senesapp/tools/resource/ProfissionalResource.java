package com.senesapp.tools.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senesapp.tools.model.Profissional;
import com.senesapp.tools.repository.ProfissionalRepository;

@RestController
@RequestMapping(value="home")
public class ProfissionalResource {
	
	@Autowired
	ProfissionalRepository profissionalRepository;
	
	//LISTANDO TODOS OS PROFISSIONAIS COM PAGINAÇÃO
	@GetMapping("/profissional")
	public List<Profissional> listaCadastrados(){
		return profissionalRepository.findAll();
	}
	
	//LISTANDO OS PROFISSIONAIS PELO ID
	@GetMapping("/profissional/{id}")
	public Profissional listaCadastradoPorId(@PathVariable(value="id") long id) {
		return profissionalRepository.findById(id);
	}
	
	@GetMapping("/profissional/especializacoes/{especializacao}")
	public List<Profissional> getProfissionaisPorEspecializacao(@PathVariable String especializacao){
		return profissionalRepository.findProfissionalPorEspecializacao(especializacao);
	}
	
}












