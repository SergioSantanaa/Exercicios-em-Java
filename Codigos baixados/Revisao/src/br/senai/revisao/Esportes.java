package br.senai.revisao;

public class Esportes extends Produto {

	public Esportes(int codigo, double preco, String nome) {
		super(codigo, preco, nome);
	}

	@Override
	public void calcularDesconto() {
		this.setPreco(getPreco() * 0.85);
	}

}
