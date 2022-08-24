package br.com.educommerce.ecommerce.service;

import java.util.ArrayList;

import br.com.educommerce.ecommerce.model.Departamento;

public interface IDepartamentoService {
	
	
	public Departamento criarNovo(Departamento novo);
	public Departamento atualizarDados(Departamento dados);
	public ArrayList<Departamento> buscarTodos();
	public Departamento BuscarPeloID(Integer id);
	public void excluirId(Integer id);
	
}
