package com.jsog.demo.interfaceservice;

import java.util.Collection;
import java.util.List;
import java.util.Optional;

import com.jsog.demo.model.Persona;


public interface IPersonaService {

	public List<Persona>listar();
	public Optional<Persona>listarID(int id);
	public int save(Persona p);
	public void delete(int id);

	
	
}
