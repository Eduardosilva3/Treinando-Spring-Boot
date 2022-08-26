package br.com.educommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.educommerce.ecommerce.model.Cliente;

import br.com.educommerce.ecommerce.service.IClienteService;

@RestController
public class ControllerCliente {
	
	@Autowired
	private IClienteService service;
	
	@GetMapping("/cliente")
	public ArrayList<Cliente> buscaTodos(){
		return service.buscarTodos();
	}
	
	//metodo para buscar pelo Cliente Nome
	@GetMapping("/cliente/buscar")
	public ArrayList<Cliente> recuperarPeloNome(@RequestParam(name = "palavra") String palavra){
		return service.buscarPeloNome(palavra);
	}
}
