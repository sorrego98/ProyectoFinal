package com.jsog.demo.service;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jsog.demo.interfaces.IPersona;
import com.jsog.demo.interfaceservice.IPersonaService;
import com.jsog.demo.model.Persona;



@Service
public class PersonaService implements IPersonaService {

	@Autowired
	private IPersona data;
	@Override
	public List<Persona> listar() {
		//return null;
		return (List<Persona>)data.findAll();
	}


	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Optional<Persona> listarID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

}
