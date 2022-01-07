package br.senai.atvFinal;

public class Exemplo {
	public static void main(String[] args) {

		Time t1 = new Time("Bahia");

		t1.setNomeTecnico("Guto");
		t1.setCodigo(01);

		t1.contratarJogador("Giberto", 9, "titular");
		t1.contratarJogador("Rossi", 7, "titular");
		t1.contratarJogador("Nino", 2, "titular");
		t1.contratarJogador("Neymar", 11, "reserva");
		t1.contratarJogador("Messi", 10, "reserva");
		t1.contratarJogador("Messi", 11, "reserva");

		t1.listarJogadoresEscalados();

		t1.desligarJogador("Neymar");

		t1.listarJogadoresEscalados();

		t1.calcularQuantidadeJogadoresEscalados();

		Jogador j1 = new Jogador("Pedro", 3, "reserva");

		t1.contratarJogador(j1);

		t1.consultarJogador("Pedro");

		t1.consultarJogador("Mario");

	}

}
