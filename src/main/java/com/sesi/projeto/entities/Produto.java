package com.sesi.projeto.entities;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

import com.sesi.projeto.dto.ProdutoDto;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import jakarta.persistence.criteria.Order;


@Entity
@Table(name = "tb_produto")
public class Produto {

	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private double preco;
	private String descricao;
	private String imgUrl;
	public Long getId() {
		return id;
	}
	
	@OneToMany(mappedBy = "id.produto")
	private Set<ItemDoPedido> items = new HashSet<>();
	
	public Set<ItemDoPedido> getItems(){
		return items;
	}
	
	public List<Pedido> getPedido(){
		return items.stream().map(x->x.getPedido()).toList();
	}
	
	@ManyToMany
	@JoinTable(name = "tb_produto_categoria_id", joinColumns = @JoinColumn(name = "produto_id"), inverseJoinColumns = @JoinColumn(name = "categoria_id"))
	
	private Set<Categoria> categorias = new HashSet<>();
	
	public Produto() {
		
	}
	
	
	
	

	public Produto(ProdutoDto d) {
		this.nome = d.nome();
		this.preco = d.preco();
		this.descricao = d.descricao();
	}

	public Produto(Long id, String nome, double preco, String descricao) {
		this.id = id;
		this.nome = nome;
		this.preco = preco;
		this.descricao = descricao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreço(double preco) {
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescrição(String descricao) {
		this.descricao = descricao;
	}

	public void setId(Long id) {
		this.id = id;
	}
	
	
	
	
	
}
