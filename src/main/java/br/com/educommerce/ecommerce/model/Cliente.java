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
@Table(name = "cliente")
public class Cliente {
		 
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "id", nullable = false)
		private Integer id;
		
		@Column(name = "nome", nullable = false, length = 100)
		private String nome;
		
		@Column(name = "email", nullable = false, length = 45, unique = true)
		private String email;
		
		@Column(name = "senha", nullable = false, length = 20)
		private String senha;
		
		@Column(name = "rg", nullable = false, length = 10)
		private String rg;
		
		@Column(name = "cpf", nullable = false, length = 45, unique = true)
		private String cpf;
		
		@OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("cliente")
		private List<Endereco> endereco;
		
		

		public List<Endereco> getEndereco() {
			return endereco;
		}

		public void setEndereco(List<Endereco> endereco) {
			this.endereco = endereco;
		}
		

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getNome() {
			return nome;
		}

		public void setNome(String nome) {
			this.nome = nome;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getSenha() {
			return senha;
		}

		public void setSenha(String senha) {
			this.senha = senha;
		}

		public String getRg() {
			return rg;
		}

		public void setRg(String rg) {
			this.rg = rg;
		}

		public String getCpf() {
			return cpf;
		}

		public void setCpf(String cpf) {
			this.cpf = cpf;
		}
		
		
}
