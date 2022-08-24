package br.com.educommerce.ecommerce.service;

import java.util.ArrayList;

import br.com.educommerce.ecommerce.model.Produto;



public interface IProduto {
	
	public Produto criarNovo(Produto novo);
	public Produto atualizarDados( Produto dados);
	public ArrayList<Produto> buscarTodos();
	public Produto BuscarPeloID(Integer id);
	public void excluirId(Integer id);
}
