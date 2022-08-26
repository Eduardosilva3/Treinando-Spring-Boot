package br.com.educommerce.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.educommerce.ecommerce.dao.ProdutoDao;
import br.com.educommerce.ecommerce.model.Produto;

@Service
public class ProdutoService implements IProduto {

	@Autowired
	private ProdutoDao dao;
	
	
	@Override
	public Produto criarNovo(Produto novo) {
		
		return dao.save(novo);
		
	}

	@Override
	public Produto atualizarDados(Produto dados) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ArrayList<Produto> buscarTodos() {
		return (ArrayList<Produto>)dao.findAll();
		
	}

	@Override
	public Produto BuscarPeloID(Integer id) {
		return dao.findById(id).orElse(null);
	}

	@Override
	public void excluirId(Integer id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ArrayList<Produto> buscarPeloNome(String nome) {
		return (ArrayList<Produto>)dao.findByNomeContaining(nome);
	}

}
