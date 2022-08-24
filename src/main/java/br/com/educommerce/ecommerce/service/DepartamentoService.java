package br.com.educommerce.ecommerce.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.educommerce.ecommerce.dao.DepartamentoDao;
import br.com.educommerce.ecommerce.model.Departamento;


@Service
public class DepartamentoService implements IDepartamentoService{

	@Autowired
	private  DepartamentoDao dao;
	
	
	
	
	
	
	@Override
	public Departamento criarNovo(Departamento novo) {
		// TODO Auto-generated method stub
		
		if(novo.getNome() != null) {
			return dao.save(novo);
		}
		return null;
	}

	@Override
	public Departamento atualizarDados(Departamento dados) {
		// Tratando para que os valores id e nome não seja null antes de enviar para o banco de dados
		
		
		if(dados.getCodigo() != null && dados.getNome() != null) {
			return dao.save(dados);
		}
		return null;
	}

	@Override
	public ArrayList<Departamento> buscarTodos() {
		// TODO Auto-generated method stub
		return (ArrayList<Departamento>)dao.findAll();
	}

	@Override
	public Departamento BuscarPeloID(Integer id) {
		// TODO Auto-generated method stub
		return dao.findById(id).orElse(null);
		
	}

	@Override
	public void excluirId(Integer id) {
		// TODO Auto-generated method stub
		
		dao.deleteById(id);
	}

}
