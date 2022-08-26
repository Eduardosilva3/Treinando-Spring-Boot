package br.com.educommerce.ecommerce.service;

import java.util.ArrayList;

import br.com.educommerce.ecommerce.model.Cliente;

public interface IClienteService {
		public ArrayList<Cliente> buscarTodos();
		
		
		//metodo para buscar pelo Cliente Nome
		public ArrayList<Cliente> buscarPeloNome(String nome);
	
}
