package com.example.demo.InterfaceServicio;

import java.util.List;
import java.util.Optional;

import com.example.demo.Modelo.usuario;

public interface Iusuarioservice {
	public List<usuario>listar();
	public Optional<usuario>listarId(int id);
	public int save(usuario u);
	public void delete(int id);

}
