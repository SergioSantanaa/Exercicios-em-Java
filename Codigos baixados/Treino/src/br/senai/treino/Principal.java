package br.senai.treino;

public class Principal {

	public static void main(String[] args) {
		Esporte Bahia  = new Esporte("Camisa", "3456", 45.0);
		 Array array = new Array("Sergio");
		 array.addProduto(Bahia); 
		 array.status();
		 System.out.println("O valor total é: "+ array.calcularValorTotal());

}
}