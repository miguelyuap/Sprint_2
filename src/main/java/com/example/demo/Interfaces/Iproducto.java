package com.example.demo.Interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Modelo.producto;

@Repository

public interface Iproducto extends CrudRepository<producto, Integer> {

}
