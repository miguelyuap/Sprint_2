package com.example.demo.Controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.InterfaceServicio.Iusuarioservice;
import com.example.demo.Modelo.usuario;

@Controller
@RequestMapping

public class Controlador2 {
	
	private Iusuarioservice service;
	@GetMapping("/listar")
	public String listar (Model model) {
		List<usuario> usuario = service.listar();
		model.addAttribute("usuario", usuario);
		return "index";
	}

}
