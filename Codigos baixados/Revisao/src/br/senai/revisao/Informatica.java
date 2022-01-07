package br.senai.revisao;

public class Informatica extends Produto {

	public Informatica(int codigo, double preco, String nome) {
		super(codigo, preco, nome);
	}
	
	@Override
	public void calcularDesconto() {
		this.setPreco(getPreco()*0.90);
		//System.out.println(this.getPreco());
	}

}
