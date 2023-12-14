package com.generation.wasd.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Positive;
import jakarta.validation.constraints.Size;


@Entity
@Table(name = "tb_produto")

public class Produto {
	
	@Id 
	@GeneratedValue (strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotBlank (message = "O nome deve ser obrigatório!")
	@Size(min = 2, max = 20, message = "O nome deve ter no mínimo 1 e no máximo 20 caracteres!")
	@Column (length = 20)
	private String nome;
	
	@Size(min = 5, max = 500, message = "A descrição deve ter no mínimo 5 e no máximo 500 caracteres!")
	@Column (length = 500)
	private String descricao;
	
	@NotBlank (message = "Informe um console pare seu produto!")
	@Size(min = 3, max = 15, message = "O console deve ter no mínimo 3 e no máximo 15 caracteres!")
	@Column (length = 15)
	private String console;
	
	@NotBlank (message = "Não é possível criar sem quantidade!")
	@Positive (message = "O número deve ser um valor positivo!")
	private int quantidade;
	
	@NotBlank (message = "Não é possível criar um produto sem o preço!")
	@Positive (message = "O valor do preço deve ser algo positivo!")
	@Column(name="cost", precision=8, scale=2)
    private Float preco;
	
	@NotBlank (message = "Insira uma foto para o seu produto!")
	private String foto;
	
	@ManyToOne //muitos produtos para uma categoria
	@JsonIgnoreProperties("Produto")
	private Categoria categoria;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
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

	public String getConsole() {
		return console;
	}

	public void setConsole(String console) {
		this.console = console;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public Float getPreco() {
		return preco;
	}

	public void setPreco(Float preco) {
		this.preco = preco;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	
	
}
