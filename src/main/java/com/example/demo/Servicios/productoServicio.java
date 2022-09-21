package com.example.demo.Servicios;

import java.util.List;
import java.util.Optional;

import com.example.demo.InterfaceServicio.Iproductoservice;
import com.example.demo.Interfaces.Iproducto;
import com.example.demo.Modelo.producto;

public class productoServicio implements Iproductoservice {
	
	private Iproducto data;

	@Override
	public List<producto> listar() {
		// TODO Auto-generated method stub
		return (List<producto>) data.findAll();
	}

	@Override
	public Optional<producto> listarId(int id) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int save(producto p) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

}
