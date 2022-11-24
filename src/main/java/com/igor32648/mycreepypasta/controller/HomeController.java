package com.igor32648.mycreepypasta.controller;

import java.security.Principal;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.igor32648.mycreepypasta.model.Historia;
import com.igor32648.mycreepypasta.repository.HistoriaRepository;

@Controller
@RequestMapping("/home")
public class HomeController {
	@Autowired
	private HistoriaRepository historiaRepository;

	@GetMapping
	public String home(Model model) {
		List<Historia> historias = historiaRepository.findAll();
		model.addAttribute("historias", historias);
		return "home";
	}
	@ExceptionHandler(IllegalArgumentException.class) 
	public String onError() {
			return "redirect:/home";
		}
	}

	/*
	 * @GetMapping("/home/{categoria}") public String
	 * categoria(@PathVariable("categoria") String categoria, Model model) {
	 * List<Historia> historias =
	 * historiaRepository.findByCategoria(Categoria.valueOf(categoria.toUpperCase())
	 * ); model.addAttribute("historias", historias); return "home"; }
	 */



/*
 * @GetMapping("/home/assustador") public String assustador(Model model) {
 * List<Historia> historias =
 * historiaRepository.findByCategoria(Categoria.ASSUSTADOR);
 * model.addAttribute("historias", historias); return "home"; }
 * 
 * @GetMapping("/home/engracado") public String engracado(Model model) {
 * List<Historia> historias =
 * historiaRepository.findByCategoria(Categoria.ENGRACADO);
 * model.addAttribute("historias", historias); return "home"; }
 * 
 * @GetMapping("/home/lendaurbana") public String lendaurbana(Model model) {
 * List<Historia> historias =
 * historiaRepository.findByCategoria(Categoria.LENDAURBANA);
 * model.addAttribute("historias", historias); return "home"; } }
 */
