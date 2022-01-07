package br.senai.lojaproduto;

import java.util.ArrayList;

public class Compra implements InterfaceProdutos {
	public String nomeCliente;
	private double valorTotal;
	private static ArrayList<Produtos> produt = new ArrayList<Produtos>();

	public Compra(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

	@Override
	public double calcularValorTotalDosProdutos() {
		for (Produtos produto : produt) {
			this.valorTotal += produto.getPreco();
		}
		return this.valorTotal;
	}

	@Override
	public void statusDaCompra() {
		for (Produtos produto : produt) {
			System.out.println(produto.getNome() + "\t" + produto.getPreco());
		}

		// for (int i = 0; i < listaProdutos.size(); i++) {
		// System.out.println(listaProdutos.get(i).getNome()+"\t"+
		// listaProdutos.get(i).getPreco());
		// }

	}

	public void addProduto(Produtos p) {
		produt.add(p);
		System.out.println("Produto Adicionado com sucesso");

	}
}
