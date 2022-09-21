package com.example.demo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.usuario;



@Repository

public interface Iusuario extends CrudRepository<usuario, Integer> {
	
	

}
