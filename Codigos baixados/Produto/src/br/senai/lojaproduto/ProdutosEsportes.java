package br.senai.lojaproduto;

public class ProdutosEsportes extends Produtos {

	public ProdutosEsportes(int codigo, String nome, double preco) {
		super(codigo, nome, preco);
	}

	@Override
	public void calcularDesconto() {
		this.setPreco(getPreco() * 0.85);
	}
}
