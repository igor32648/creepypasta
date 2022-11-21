package com.igor32648.mycreepypasta.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.igor32648.mycreepypasta.model.Categoria;
import com.igor32648.mycreepypasta.model.Historia;
import com.igor32648.mycreepypasta.repository.HistoriaRepository;

@Controller
public class CategoriaController {
	@Autowired
	private HistoriaRepository historiaRepository;

	@GetMapping("/{categoria}/")
	public String categoria(@PathVariable("categoria") String categoria, Model model) {
		List<Historia> historias = historiaRepository.findByCategoria(Categoria.valueOf(categoria.toUpperCase()));
		model.addAttribute("historias", historias);
		return "categoria";
	}

}