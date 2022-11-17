package com.igor32648.mycreepypasta.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.igor32648.mycreepypasta.dto.RequisicaoNovaHistoria;
import com.igor32648.mycreepypasta.model.Historia;
import com.igor32648.mycreepypasta.model.repository.HistoriaRepository;

@Controller
@RequestMapping("historia")
public class HistoriaController {
	
	@Autowired
	private HistoriaRepository historiaRepository; 

	@GetMapping("formulario")
	public String formulario() {
		return "historia/formulario";
	}
	
	@PostMapping("novo")
	public String novo(RequisicaoNovaHistoria requisicao) {
		Historia historia = requisicao.toHistoria();
		historiaRepository.save(historia);
		return "novo";
	}
}
