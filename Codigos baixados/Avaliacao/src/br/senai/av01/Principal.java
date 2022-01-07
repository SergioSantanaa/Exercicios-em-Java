//Disciplina: Desenvolvimento de Sistemas I Docente: Westn Melo
//Data: / /
//Aluno (a): Sergio Costa de Santana;



package br.senai.av01;

public class Principal {

	public static void main(String[] args) {
		PessoaFisica pedro = new PessoaFisica("Pedro", 24, 4000.0, "12345678910");
		PessoaFisica john = new PessoaFisica("John", 19, 1900.0, "10987654321");

		pedro.status();
		pedro.calcularValorDoImposto();
		john.status();
		john.calcularValorDoImposto();
		PessoaJuridica atl = new PessoaJuridica("Atl", 2, 400000.0, "53545437645645-1");
		atl.status();
		atl.calcularValorDoImposto();

	}

}
