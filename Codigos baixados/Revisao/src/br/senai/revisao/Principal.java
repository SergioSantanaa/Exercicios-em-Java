package br.senai.revisao;

public class Principal {

	public static void main(String[] args) {
		Informatica info = new Informatica(34645, 10.0, "Teclado gamer");
		Informatica info1 = new Informatica (57668, 40.0, "Mouse Gamer");
		Esportes espo = new Esportes(45657, 12.0, "Bola");

		Compra compra = new Compra("Sergio");
		compra.addProduto(espo);
		compra.addProduto(info);
		compra.addProduto(info1);	
		compra.status();
		System.out.println("O valor total da compra é : " + compra.calcularValorTotalCompra());
	}

}
