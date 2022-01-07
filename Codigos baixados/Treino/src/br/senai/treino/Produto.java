package br.senai.treino;

public class Produto {
	private String nome;
	private String codigo;
	private double preco;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public Produto(String nome, String codigo, double preco) {
		super();
		this.nome = nome;
		this.codigo = codigo;
		this.preco = preco;
	}
	public void calcularDesconto() {
		
	}

}
