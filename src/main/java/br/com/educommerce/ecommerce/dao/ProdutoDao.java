package br.com.educommerce.ecommerce.dao;

import java.util.ArrayList;

import org.springframework.data.repository.CrudRepository;

import br.com.educommerce.ecommerce.model.Produto;

public interface ProdutoDao extends CrudRepository<Produto, Integer>{
		
	//metodos para consulta do produto atraves do nome
	//metodos foi implantado no service e no controller
	
		public ArrayList<Produto> findByOrderByPreco();
		public ArrayList<Produto> findByNomeContaining(String palavraChave);
}
