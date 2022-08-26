package br.com.educommerce.ecommerce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.educommerce.ecommerce.dao.PedidoDao;
import br.com.educommerce.ecommerce.model.ItemPedido;
import br.com.educommerce.ecommerce.model.Pedido;

@Service
public class PedidoService implements IPedidoService{
	
	@Autowired
	private PedidoDao dao;
	
	@Override
	public Pedido criarNovo(Pedido novo) {
		
		for(ItemPedido item : novo.getItens()) {
			item.setPedido(novo);
		}
		
		return dao.save(novo);
	}

	@Override
	public Pedido buscarPeloId(Integer id) {
		
		return dao.findById(id).orElse(null);
	}

}
