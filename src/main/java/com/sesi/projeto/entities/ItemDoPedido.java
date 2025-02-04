package com.sesi.projeto.entities;

import com.sesi.projeto.dto.ItemDoPedidoDto;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_pedido_item")

public class ItemDoPedido {

	@EmbeddedId

	private ItemDoPedidoPK id = new ItemDoPedidoPK();

	private Integer quantidade;

	private double preco;

	private ItemDoPedido() {
	}

	public ItemDoPedido(Pedido pedido, Produto produto, Integer quantidade, Double preco) {
		id.setPedido(pedido);
		id.setProduto(produto);
		this.quantidade = quantidade;
		this.preco = preco;
	}


		public ItemDoPedido(ItemDoPedidoDto dto) {
		// TODO Auto-generated constructor stub
	}

		public Pedido getPedido() {
		return id.getPedido();
	}

	public void setPedido(Pedido pedido) {
		id.setPedido(pedido);
	}
	
	public Produto getProduto() {
		return id.getProduto();
	}

	public void setProduto(Produto produto) {
		id.setProduto(produto);
	}
	

}
