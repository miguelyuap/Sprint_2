package com.example.demo.Controlador;

import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.InterfaceServicio.Iproductoservice;
import com.example.demo.Modelo.producto;

@Controller
@RequestMapping

public class Controlador {
	
	private Iproductoservice service;
	@GetMapping("/listar")
	public String listar (Model model) {
		List<producto> producto = service.listar();
		model.addAttribute("producto", producto);
		return "index";
	}
	


}
