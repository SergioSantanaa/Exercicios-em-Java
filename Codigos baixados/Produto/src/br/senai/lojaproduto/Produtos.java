/*Voc� foi convidado a desenvolver um programa em java para uma loja de venda de produtos.
A loja � especializada em produtos de esportes e inform�tica.
Todos os produtos cadastrados possuem (c�digo, nome, pre�o).
Os produtos de esportes est�o com desconto de 15% nos seus valores e os de inform�tica 10%.
Elabore um programa em java que possua uma classe Produtos com os atributos citados
acima e com o m�todo CalcularDesconto para calcular os descontos dos produtos. Crie as classes
Esportes e Inform�tica que herdar�o da classe Produtos todos os atributos e o m�todo.
Reescreva o m�todo nas classes para calcular o desconto do produto de acordo com o seu desconto
e atribua esse novo valor para o atributo pre�o.

Crie uma classe Compra que possuir� os atributos (nome do cliente, Arraylist de produtos,Valortotal).

Crie uma interface que possuir� os seguintes m�todos: - Calcular valor total de todos os produtos da compra - Status (mostrar todos os produtos de cada compra)
Reescreva os m�todos da interface na classe compra.
Na classe Main, instancie todos os objetos e chame todos os m�todos para testar.
*/

package br.senai.lojaproduto;

public class Produtos {
	private int codigo;
	private String nome;
	private double preco;

	@Override
	public String toString() {
		return "Produtos [codigo=" + codigo + ", nome=" + nome + ", preco=" + preco + "]";
	}

	public Produtos(int codigo, String nome, double preco) {
		super();
		this.codigo = codigo;
		this.nome = nome;
		this.preco = preco;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public void calcularDesconto() {

	}

}
