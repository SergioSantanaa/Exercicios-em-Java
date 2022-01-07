package br.senai.av01;

public class ImpostoDeRenda {
	private String nome;
	private int idade;
	private double rendaBruta;

	public ImpostoDeRenda(String nome, int idade, double rendaBruta, String cpf) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.rendaBruta = rendaBruta;

	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public double getRendaBruta() {
		return rendaBruta;
	}

	public void setRendaBruta(double rendaBruta) {
		this.rendaBruta = rendaBruta;
	}

	public void status() {

	}
}
