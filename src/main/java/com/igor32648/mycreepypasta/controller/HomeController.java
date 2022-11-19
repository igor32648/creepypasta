package com.igor32648.mycreepypasta.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.igor32648.mycreepypasta.model.Historia;
import com.igor32648.mycreepypasta.repository.HistoriaRepository;

@Controller
public class HomeController {
	@Autowired
	private HistoriaRepository historiaRepository;

	@GetMapping("/home")
	public String home(Model model) {
		List<Historia> historias = historiaRepository.findAll();
		model.addAttribute("historias", historias);
		return "home";
	}

}
