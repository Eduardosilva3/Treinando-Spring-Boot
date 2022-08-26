package br.com.educommerce.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.educommerce.ecommerce.dao.ClienteDao;
import br.com.educommerce.ecommerce.model.Cliente;

@Service
public class ClienteService implements IClienteService{
	
	@Autowired
	private ClienteDao dao;
	
	@Override
	public ArrayList<Cliente> buscarTodos() {
		
		return (ArrayList<Cliente>)dao.findAll();
	}
	
	//metodo para buscar pelo Cliente Nome
	@Override
	public ArrayList<Cliente> buscarPeloNome(String nome) {
		
		return (ArrayList<Cliente>)dao.findByNomeContaining(nome);
		
	}

}
