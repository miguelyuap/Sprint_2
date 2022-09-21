package com.example.demo.InterfaceServicio;

import java.util.List;
import java.util.Optional;

import com.example.demo.Modelo.producto;

public interface Iproductoservice {
	
	public List<producto>listar();
	public Optional<producto>listarId(int id);
	public int save(producto p);
	public void delete(int id);
	

}
  