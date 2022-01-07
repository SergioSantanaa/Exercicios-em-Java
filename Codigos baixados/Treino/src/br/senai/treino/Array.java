package br.senai.treino;

import java.util.ArrayList;

public class Array implements InterfaceProdutos {
	private String nomeCliente;
	private double valorTotal;
	private static ArrayList<Produto> produt = new ArrayList<Produto>();

	public Array(String nomeCliente) {
		this.nomeCliente = nomeCliente;

	}

	@Override
	public double calcularValorTotal() {
		for (Produto produto : produt) {
			this.valorTotal += produto.getPreco();
		}
		return this.valorTotal;

	}

	@Override
	public void status() {
		for (Produto produto : produt) {
			System.out.println(produto.getNome() + "\t" + produto.getPreco());
		}

	}

	public  void addProduto(Produto p) {
		produt.add(p);
		System.out.println("Produto Adicionado com sucesso");

	}
}
