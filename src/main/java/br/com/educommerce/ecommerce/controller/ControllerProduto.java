package br.com.educommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.educommerce.ecommerce.model.Produto;
import br.com.educommerce.ecommerce.service.IProduto;

@RestController
public class ControllerProduto {
		
	@Autowired
	private IProduto service;
	
	
	@GetMapping("/produto")
	public ArrayList<Produto> recuperarTodos(){
		return service.buscarTodos();
	}
	
	@PostMapping("/produto")
	public ResponseEntity<Produto> adicionarProduto(@RequestBody Produto novo) {
		Produto res = service.criarNovo(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		
		return ResponseEntity.notFound().build();
	}
}
