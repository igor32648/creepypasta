package com.igor32648.mycreepypasta.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.igor32648.mycreepypasta.dto.RequisicaoNovaHistoria;
import com.igor32648.mycreepypasta.model.Historia;
import com.igor32648.mycreepypasta.repository.HistoriaRepository;

@Controller
@RequestMapping("historia")
public class HistoriaController {

	@Autowired
	private HistoriaRepository historiaRepository;

	@GetMapping("formulario")
	public String formulario(RequisicaoNovaHistoria resquisicao) {
		return "historia/formulario";
	}

	@PostMapping("novo")
	public String novo(@Valid RequisicaoNovaHistoria requisicao, BindingResult result, Model model) {
		if (result.hasErrors()) {
			System.out.println("Erou");
			System.out.println(result.getErrorCount());
			System.out.println(result.getFieldValue("nomeHistoria"));
			System.out.println(result.getAllErrors());
			return "historia/formulario";
		}
		Historia historia = requisicao.toHistoria();

		historiaRepository.save(historia);
		//List<Historia> historias = historiaRepository.findAll();
		//model.addAttribute("historias", historias);
		return "redirect:/home";
	}
}
