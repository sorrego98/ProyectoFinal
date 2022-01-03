package interfaceservice;

import java.util.List;
import java.util.Optional;

import model.persona;

public interface IPersonaService {
	public List<persona>listar();
	public Optional<persona>listarID(int ID);
	public int save(persona p);
	public void delete(int ID);

}
