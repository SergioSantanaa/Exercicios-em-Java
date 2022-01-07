package br.senai.atvFinal;


public class Jogador {

	private int numeroCamisa;
	private String nome;
	private String situacao;

	public Jogador(String nome, int numeroCamisa, String situacao) {
		super();
		this.numeroCamisa = numeroCamisa;
		this.nome = nome;
		this.situacao = situacao;
	}

	public int getNumeroCamisa() {
		return numeroCamisa;
	}

	public void setNumeroCamisa(int numeroCamisa) {
		this.numeroCamisa = numeroCamisa;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSituacao() {
		return situacao;
	}

	public void setSituacao(String situacao) {
		this.situacao = situacao;
	}

	@Override
	public String toString() {
		return "Jogador [numeroCamisa=" + numeroCamisa + ", nome=" + nome + ", situacao=" + situacao + "]";
	}

}