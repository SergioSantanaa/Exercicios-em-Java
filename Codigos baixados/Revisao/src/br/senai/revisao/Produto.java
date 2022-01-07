package br.senai.revisao;

public class Produto {
	private int codigo;
	private double preco;
	private String nome;

	public Produto(int codigo, double preco, String nome) {
		super();
		this.codigo = codigo;
		this.preco = preco;
		this.nome = nome;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public void calcularDesconto() {

	}

}
