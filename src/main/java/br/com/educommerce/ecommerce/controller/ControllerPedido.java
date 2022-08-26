package br.com.educommerce.ecommerce.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.com.educommerce.ecommerce.model.Pedido;
import br.com.educommerce.ecommerce.service.IPedidoService;


@RestController
public class ControllerPedido {
		
		@Autowired
		private IPedidoService service;
		
		/*
		 * estrutura para adicionar pedido Obs.: para adicionar produtos em lista no
		 * arraylist é necessario adicionar [] no json
		 * 
		 * { "data":"2022-08-25", "valorBruto": 1000, "status": "Em Processamento",
		 * "desconto": 100, "valorFinal": 900, "cliente": { "id": 2 }, 
		 * "itens":[ {
		 * "produto":{ "codigo": 2 }, "quantidade" :5, "valorUnitario" : 200,
		 * "valorTotal" : 1000 } 
		 * ] 
		 * }
		 * 
		 * 
		 */
		
		@PostMapping("/pedido")
		public ResponseEntity<Pedido> criarNovoPedido(@RequestBody Pedido novo){
			Pedido res = service.criarNovo(novo);
			if(res != null) {
				return ResponseEntity.ok(res);
			}
			return ResponseEntity.notFound().build();
		}
		
		@GetMapping("/pedido/{numero}")
		public ResponseEntity<Pedido> retornaPeloId(@PathVariable Integer numero){
			Pedido res = service.buscarPeloId(numero);
			if(res != null) {
				return ResponseEntity.ok(res);
			}
			
			return ResponseEntity.notFound().build();
		}
		
}
