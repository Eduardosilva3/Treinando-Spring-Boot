package br.com.educommerce.ecommerce.model;

import java.time.LocalDate;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@Entity
@Table(name="pedido")
public class Pedido {
		
		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		@Column(name = "numero", nullable = false)
		private Integer numero;
		
		@Column(name = "data_pedido" , nullable = false)
		private LocalDate data;
		
		@Column(name = "valor_bruto", nullable = false)
		private Double valorBruto;
		
		@Column(name = "status", nullable= false)
		private String status;
		
		@Column(name = "desconto")
		private Double desconto;
		
		@Column(name = "valor_final")
		private Double valorFinal;
		
		@ManyToOne
		@JoinColumn(name = "cliente_id")
		private Cliente cliente;
		
		
		/*para retorn todos pedidos e os itens no pedidos, segue o codigo abaixo
		 * 
		 * crie uma lista com os itens que vai querer retorna dos pedidos
		 * observe que o one to may , um para muitos referencia o nome do atributo que está sendo referencia na classe
		 * de pedido. 
		 * 
		 * aplica o jsonIgnore para evitar um loop durante o processamento
		 * 
		 */
		
		@OneToMany(mappedBy = "pedido", cascade = CascadeType.ALL)
		@JsonIgnoreProperties("pedido")
		private List<ItemPedido> itens;
		
		

		
		
		public Cliente getCliente() {
			return cliente;
		}

		public void setCliente(Cliente cliente) {
			this.cliente = cliente;
		}

		public List<ItemPedido> getItens() {
			return itens;
		}

		public void setItens(List<ItemPedido> itens) {
			this.itens = itens;
		}

		public Integer getNumero() {
			return numero;
		}

		public void setNumero(Integer numero) {
			this.numero = numero;
		}

		public LocalDate getData() {
			return data;
		}

		public void setData(LocalDate data) {
			this.data = data;
		}

		public Double getValorBruto() {
			return valorBruto;
		}

		public void setValorBruto(Double valorBruto) {
			this.valorBruto = valorBruto;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public Double getDesconto() {
			return desconto;
		}

		public void setDesconto(Double desconto) {
			this.desconto = desconto;
		}

		public Double getValorFinal() {
			return valorFinal;
		}

		public void setValorFinal(Double valorFinal) {
			this.valorFinal = valorFinal;
		}
		
		
}
