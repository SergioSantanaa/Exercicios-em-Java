package br.senai.treino;

public class Esporte extends Produto implements InterfaceProdutos{

	public Esporte(String nome, String codigo, double preco) {
		super(nome, codigo, preco);
	}
	
	
	@Override
	public void calcularDesconto() {
		this.setPreco(getPreco() * 0.85);

	}

	@Override
	public void status() {
		
		
	}


	@Override
	public double calcularValorTotal() {
		// TODO Auto-generated method stub
		return 0;
	}


}
