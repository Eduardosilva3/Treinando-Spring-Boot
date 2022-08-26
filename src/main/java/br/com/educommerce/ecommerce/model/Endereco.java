package br.com.educommerce.ecommerce.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name = "endereco")
public class Endereco {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "num_seq", nullable = false)
		private Integer numSeq;
		
		@Column(name = "tipo", nullable = false, length = 5)
		private String  tipo;
		
		@Column(name = "logradouro", nullable = false, length = 45)
		private String logradouro;
		
		@Column(name = "numero", nullable = false)
		private Integer numero;
		
		@Column(name = "complemento", nullable = false, length = 45)
		private String  complemento;
		
		@Column(name = "bairro", nullable = false, length = 45)
		private String bairro;
		
		@Column(name = "cidade", nullable = false, length = 45)
		private String cidade;
		
		@Column(name = "cep", nullable = false, length = 10)
		private String cep;
		
		@Column(name = "estado", nullable = false, length = 2)
		private String estado;
		
		@ManyToOne
		@JoinColumn(name = "cliente_id")
		@JsonIgnoreProperties("endereco")
		private Cliente cliente;

		public Integer getNumSeq() {
			return numSeq;
		}

		public void setNumSeq(Integer numSeq) {
			this.numSeq = numSeq;
		}

		public String getTipo() {
			return tipo;
		}

		public void setTipo(String tipo) {
			this.tipo = tipo;
		}

		public String getLogradouro() {
			return logradouro;
		}

		public void setLogradouro(String logradouro) {
			this.logradouro = logradouro;
		}

		public Integer getNumero() {
			return numero;
		}

		public void setNumero(Integer numero) {
			this.numero = numero;
		}

		public String getComplemento() {
			return complemento;
		}

		public void setComplemento(String complemento) {
			this.complemento = complemento;
		}

		public String getBairro() {
			return bairro;
		}

		public void setBairro(String bairro) {
			this.bairro = bairro;
		}

		public String getCidade() {
			return cidade;
		}

		public void setCidade(String cidade) {
			this.cidade = cidade;
		}

		public String getCep() {
			return cep;
		}

		public void setCep(String cep) {
			this.cep = cep;
		}

		public String getEstado() {
			return estado;
		}

		public void setEstado(String estado) {
			this.estado = estado;
		}

		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}
		
		
}
