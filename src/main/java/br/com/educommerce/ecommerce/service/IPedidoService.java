package br.com.educommerce.ecommerce.service;

import br.com.educommerce.ecommerce.model.Pedido;

public interface IPedidoService {
		public Pedido criarNovo(Pedido novo);
		public Pedido buscarPeloId(Integer id);
		
}
