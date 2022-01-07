/*Você foi convidado a desenvolver um programa em java para uma loja de venda de produtos.
A loja é especializada em produtos de esportes e informática.
Todos os produtos cadastrados possuem (código, nome, preço).
Os produtos de esportes estão com desconto de 15% nos seus valores e os de informática 10%.
Elabore um programa em java que possua uma classe Produtos com os atributos citados
acima e com o método CalcularDesconto para calcular os descontos dos produtos. Crie as classes
Esportes e Informática que herdarão da classe Produtos todos os atributos e o método.
Reescreva o método nas classes para calcular o desconto do produto de acordo com o seu desconto
e atribua esse novo valor para o atributo preço.

Crie uma classe Compra que possuirá os atributos (nome do cliente, Arraylist de produtos,Valortotal).

Crie uma interface que possuirá os seguintes métodos: - Calcular valor total de todos os produtos da compra - Status (mostrar todos os produtos de cada compra)
Reescreva os métodos da interface na classe compra.
Na classe Main, instancie todos os objetos e chame todos os métodos para testar.
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
