package com.jsog.demo.controller;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jsog.demo.model.Persona;
import com.jsog.demo.service.PersonaService;



@RestController
public class PersonaController {
	
	@Autowired
	private PersonaService service;
	
	/*@RequestMapping("/listar")
	public String listar(Model model) {
		Collection<Persona> personas=service.listar();
		return personas.toString();
	}*/
	
	@RequestMapping(value = "/listar", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<Persona>> listar() {
        List<Persona> personas = service.listar();        
        return new ResponseEntity<List<Persona>>(personas, HttpStatus.OK);
    }
	


}
