package br.senai.revisao;

import java.util.ArrayList;

public class Compra implements InterfaceProduto {
	private String nomeDoCliente;
	private double valorTotal;
	private static ArrayList<Produto> produto = new ArrayList();

	public Compra(String nomeDoCliente) {
		this.nomeDoCliente = nomeDoCliente;
	}

	@Override
	public double calcularValorTotalCompra() {
		for (Produto produto : produto) {
			this.valorTotal += produto.getPreco();

		}
		return this.valorTotal;

	}

	@Override
	public void status() {
		for (Produto produto : produto) {
			System.out.println(produto.getNome() + "\t " + produto.getPreco() +"\t"+ produto.getCodigo());

		}
	}

	public void addProduto(Produto p) {
		produto.add(p);
		System.out.println("Produto Adicionado com sucesso");

	}
}
