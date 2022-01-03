package controller;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import model.persona;
import service.PersonaService;

@Controller
@RequestMapping
public class Controlador {
	
	private PersonaService service;
	
	@GetMapping("/listar")
	public String Listar(Model model) {
		List<persona>personas=service.listar();
		return "index";
		model.addAttribute("personas", personas);
	}

}
