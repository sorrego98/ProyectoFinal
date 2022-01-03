package service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import interfaces.IPersona;
import interfaceservice.IPersonaService;
import model.persona;

@Service
public class PersonaService implements IPersonaService{

	@Autowired
	private IPersona data;
	@Override
	public List<persona> listar() {
		return (List<persona>)data.findAll();
	}

	@Override
	public Optional<persona> listarID(int ID) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(persona p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int ID) {
		// TODO Auto-generated method stub
		
	}

}
