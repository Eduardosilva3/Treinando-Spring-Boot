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
@Table(name = "item_pedido")
public class ItemPedido {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "numero_sequencial", nullable = false)
	private Integer numeroSequencial;
	
	/*
	 * segue abaixo a realação de muito para um, assim é possivel referenciar na tabela que, o pedido faz referencia a classe
	 * objeto pedido, que tem como identificação o numero do pedido na tabela
	 * 
	 * Lembre-se que é necessario declarar o nome do objeto(tabela) que foi criado como classe. em casos de chaves estrageiras manytoone
	 */
	
	@ManyToOne
	@JoinColumn(name = "pedido_numero")
	@JsonIgnoreProperties("itens")
	private Pedido pedido;
	
	@ManyToOne
	@JoinColumn(name = "produto_codigo")
	private Produto produto;
	
	@Column(name = "quantidade", nullable = false)
	private Integer quantidade;
	
	@Column(name = "valor_unitario", nullable = false)
	private Double valorUnitario;
	
	@Column(name = "valor_total", nullable = false)
	private double valorTotal;

	public Integer getNumeroSequencial() {
		return numeroSequencial;
	}

	public void setNumeroSequencial(Integer numeroSequencial) {
		this.numeroSequencial = numeroSequencial;
	}

	public Pedido getPedido() {
		return pedido;
	}

	public void setPedido(Pedido pedido) {
		this.pedido = pedido;
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Double getValorUnitario() {
		return valorUnitario;
	}

	public void setValorUnitario(Double valorUnitario) {
		this.valorUnitario = valorUnitario;
	}

	public double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	
}
