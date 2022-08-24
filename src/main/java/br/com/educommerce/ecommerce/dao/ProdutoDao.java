package br.com.educommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.educommerce.ecommerce.model.Produto;

public interface ProdutoDao extends CrudRepository<Produto, Integer>{

}
