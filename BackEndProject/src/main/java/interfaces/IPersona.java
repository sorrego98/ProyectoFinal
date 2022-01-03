package interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import model.persona;

@Repository
public interface IPersona extends CrudRepository<persona, Integer>{

}
