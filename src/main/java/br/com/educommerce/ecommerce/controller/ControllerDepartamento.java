package br.com.educommerce.ecommerce.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.educommerce.ecommerce.model.Departamento;
import br.com.educommerce.ecommerce.service.IDepartamentoService;

@RestController
public class ControllerDepartamento {
		
	@Autowired
	private IDepartamentoService service;
	
	@GetMapping("/departamentos")
	public ArrayList<Departamento> recuperarTodos(){
		
		 
		
		return (ArrayList<Departamento>)service.buscarTodos();
		
	}
	
	@PostMapping("/departamentos")
	public ResponseEntity<Departamento> incluirNovo(@RequestBody Departamento novo) {
		Departamento res = service.criarNovo(novo);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		
		//codigo 400 http
		return ResponseEntity.badRequest().build();
	}
	
	
	
	@PutMapping("/departamentos")
	public ResponseEntity<Departamento> alterar(@RequestBody Departamento dado){
		Departamento res = service.atualizarDados(dado);
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		//codigo 400 http
				return ResponseEntity.badRequest().build();
	}
	
	@DeleteMapping("/departamentos/{id}")
	public ResponseEntity<Departamento> excluirDepartamento (@PathVariable Integer id){
			service.excluirId(id);
			return ResponseEntity.ok(null);
			
	}
	
	@GetMapping("/departamentos/{id}")
	public ResponseEntity<Departamento> retornaId (@PathVariable Integer id){
		Departamento res = service.BuscarPeloID(id);
		
		if(res != null) {
			return ResponseEntity.ok(res);
		}
		
		//Retornando Erro 404 para visualizar
		return ResponseEntity.notFound().build();
		
	}
 		
}
