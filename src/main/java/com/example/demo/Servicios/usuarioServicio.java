package com.example.demo.Servicios;

import java.util.List;
import java.util.Optional;

import com.example.demo.InterfaceServicio.Iusuarioservice;
import com.example.demo.Interfaces.Iusuario;
import com.example.demo.Modelo.usuario;

public class usuarioServicio implements Iusuarioservice {
	
	private Iusuario data;

	@Override
	public List<usuario> listar() {
		// TODO Auto-generated method stub
		return (List<usuario>) data.findAll();
	}

	@Override
	public Optional<usuario> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
