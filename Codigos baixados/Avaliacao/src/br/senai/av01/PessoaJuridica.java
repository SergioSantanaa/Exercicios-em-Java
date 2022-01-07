package br.senai.av01;

public class PessoaJuridica extends ImpostoDeRenda implements InterfaceValorImposto {
	private String cnpj;

	public PessoaJuridica(String nome, int idade, double rendaBruta, String cnpj) {
		super(nome, idade, rendaBruta, cnpj);
	}

	@Override
	public void calcularValorDoImposto() {

		System.out.println("O valor do imposto será : " + this.getRendaBruta() * 0.10);

	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	@Override
	public void status() {

		System.out.println("Nome da empresa contribuinte : " + this.getNome() + "\nSua idade " + this.getIdade()
				+ " anos" + "do CNPJ : " + this.getCnpj() + "\nSua renda bruta é : " + this.getRendaBruta());

	}
}