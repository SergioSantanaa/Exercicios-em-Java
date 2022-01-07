package br.senai.lojaproduto;

public class ProdutosInformatica extends Produtos {

	public ProdutosInformatica(int codigo, String nome, double preco) {
		super(codigo, nome, preco);
	}

	@Override
	public void calcularDesconto() {
		this.setPreco(getPreco() * 0.9);
	}
}
