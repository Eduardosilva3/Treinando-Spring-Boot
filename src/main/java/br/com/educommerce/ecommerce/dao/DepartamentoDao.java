package br.com.educommerce.ecommerce.dao;

import org.springframework.data.repository.CrudRepository;

import br.com.educommerce.ecommerce.model.Departamento;

public interface DepartamentoDao extends CrudRepository<Departamento, Integer> {

}
