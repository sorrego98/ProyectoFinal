package com.jsog.demo.interfaces;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jsog.demo.model.Persona;


@Repository
public interface IPersona extends CrudRepository<Persona, Integer>{
	

}
