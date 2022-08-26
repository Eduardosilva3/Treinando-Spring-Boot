package br.com.educommerce.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.educommerce.ecommerce.model.Cliente;


public interface ClienteDao extends CrudRepository<Cliente, Integer> {
	
	//metodo para buscar pelo Cliente Nome
	
	public ArrayList<Cliente> findByNomeContaining(String palavraChave);
}
