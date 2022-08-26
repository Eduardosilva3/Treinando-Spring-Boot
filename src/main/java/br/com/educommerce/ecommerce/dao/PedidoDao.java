package br.com.educommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.educommerce.ecommerce.model.Pedido;

public interface PedidoDao extends CrudRepository<Pedido, Integer>{

}
