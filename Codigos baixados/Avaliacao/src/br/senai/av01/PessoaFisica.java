package br.senai.av01;

public class PessoaFisica extends ImpostoDeRenda implements InterfaceValorImposto {
	private String cpf;

	public PessoaFisica(String nome, int idade, double rendaBruta, String cpf) {
		super(nome, idade, rendaBruta, cpf);
	}

	@Override
	public void calcularValorDoImposto() {

		if (this.getRendaBruta() <= 2000) {

			System.out.println("O valor do imposto será : " + this.getRendaBruta() * 0.10);
		} else {

			System.out.println("O valor do imposto será : " + this.getRendaBruta() * 0.20);
		}
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	@Override
	public void status() {
		System.out.println("Nome do contribuinte " + this.getNome() + "\nSua idade " + this.getIdade() + " anos"
				+ "\ndo CPF : " + this.getCpf() + "\nSua renda bruta é : " + this.getRendaBruta());

	}
}
