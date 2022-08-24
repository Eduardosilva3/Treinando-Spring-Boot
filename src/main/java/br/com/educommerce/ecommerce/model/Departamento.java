package br.com.educommerce.ecommerce.model;



import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name="departamento")
public class Departamento {
		
	
		@Column(name="codigo")
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private Integer codigo;
		
		@Column(name = "nome", length = 45, nullable = false)
		private String nome;
		
		@Column(name = "descricao", length = 45, nullable = true)
		private String descricao;
		
		//relação um para muitos
		@OneToMany(mappedBy = "departamento", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("departamento")
		private List<Produto> listaProdutos;
		
		
		
		public Integer getCodigo() {
			return codigo;
		}
		public void setCodigo(Integer codigo) {
			this.codigo = codigo;
		}
		public String getNome() {
			return nome;
		}
		public void setNome(String nome) {
			this.nome = nome;
		}
		public String getDescricao() {
			return descricao;
		}
		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
		public List<Produto> getListaProdutos() {
			return listaProdutos;
		}
		public void setListaProdutos(List<Produto> listaProdutos) {
			this.listaProdutos = listaProdutos;
		}
		
		
		
		
}
