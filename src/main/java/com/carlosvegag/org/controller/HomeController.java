package com.carlosvegag.org.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.carlosvegag.org.model.Producto;
import com.carlosvegag.org.service.intProductoService;

@Controller
public class HomeController {
	@Autowired
	private intProductoService productosService;
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	@GetMapping("/")
	public String mostrarIndex(Model model) {
		List<Producto> lista=productosService.obtenerTodos();
		model.addAttribute("productos", lista);
		return "home";
	}
}
