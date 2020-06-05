package com.senesapp.tools.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senesapp.tools.model.Especializacao;
import com.senesapp.tools.repository.EspecializacaoRepository;

@RestController
@RequestMapping(value="inicio")
public class EspecializacaoResource {
	
	@Autowired
	private EspecializacaoRepository especializacaoRepository;
	
	@GetMapping("/especializacoes")
	public List<Especializacao> listaEspecializacoes(){
		return especializacaoRepository.findAll();
	}

}
