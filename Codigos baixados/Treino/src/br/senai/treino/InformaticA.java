package br.senai.treino;

public class InformaticA extends Produto {

	public InformaticA(String nome, String codigo, double preco) {
		super(nome, codigo, preco);
	}

	@Override
	public void calcularDesconto() {
		this.setPreco(getPreco() * 0.90);

	}

}
