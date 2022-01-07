package br.senai.lojaproduto;

public class Loja {

	public static void main(String[] args) {
		ProdutosEsportes e1 = new ProdutosEsportes(1002, "Bola do Bahia", 120.0);
		ProdutosInformatica i1 = new ProdutosInformatica(545, "Notebook Dell", 5000.00);
		
		Compra compra = new Compra("Josias");
		
		compra.addProduto(i1);
		compra.addProduto(e1);
		compra.statusDaCompra();
		
		System.out.println("O valor total é: " + compra.calcularValorTotalDosProdutos());
}
}