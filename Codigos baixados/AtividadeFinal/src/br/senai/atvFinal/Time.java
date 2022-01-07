package br.senai.atvFinal;

import java.util.ArrayList;

public class Time {

	private String nome;
	private String nomeTecnico;
	private int codigo;
	private ArrayList<Jogador> jogadores = new ArrayList<>();
	private ArrayList<Jogador> jogadoresEscalados = new ArrayList<>();
	private int contadorTitular = 0;
	private int contadorReserva = 0;

	public Time(String nome) {
		super();
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getNomeTecnico() {
		return nomeTecnico;
	}

	public void setNomeTecnico(String nomeTecnico) {
		this.nomeTecnico = nomeTecnico;
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "Time [nome=" + nome + ", nomeTecnico=" + nomeTecnico + ", codigo=" + codigo + ", jogadores=" + jogadores
				+ ", jogadoresEscalados=" + jogadoresEscalados + "]";
	}

	private boolean jogadorExiste(Jogador jogador) {

		for (Jogador jog1 : jogadores) {
			if (jogador.getNome().equalsIgnoreCase(jog1.getNome())
					|| jogador.getNumeroCamisa() == jog1.getNumeroCamisa()) {
				System.out.println("Jogador já existe.");
				return true;
			}
		}

		for (Jogador jog2 : jogadoresEscalados) {
			if (jogador.getNome().equalsIgnoreCase(jog2.getNome())
					|| jogador.getNumeroCamisa() == jog2.getNumeroCamisa()) {
				System.out.println("Jogador já existe.");
				return true;
			}

		}
		return false;
	}

	public boolean contratarJogador(Jogador jogador) {
		if (jogadorExiste(jogador) == false) {
			if (jogador.getSituacao().equalsIgnoreCase("titular")) {
				if (contadorTitular < 11) {
					jogadoresEscalados.add(jogador);
					contadorTitular++;
					System.out.println("Jogador escalado.");
					return true;
				} else {
					System.out.println("Não é possível escalar jogador.");
					return false;
				}
			} else if (jogador.getSituacao().equalsIgnoreCase("reserva")) {
				if (contadorReserva < 12) {
					jogadoresEscalados.add(jogador);
					contadorReserva++;
					System.out.println("Jogador escalado.");
					return true;
				} else {
					System.out.println("Não é possível escalar jogador.");
					return false;
				}

			} else {
				jogadores.add(jogador);
				System.out.println("Jogador adicionado");
				return true;
			}
		}
		System.out.println("Jogador já existe.");
		return false;
	}

	public boolean contratarJogador(String nome, int numeroCamisa, String situacao) {

		Jogador jogador = new Jogador(nome, numeroCamisa, situacao);
		return contratarJogador(jogador);

	}

	public boolean desligarJogador(String nome) {
		for (Jogador jog1 : jogadores) {
			if (nome.equalsIgnoreCase(jog1.getNome())) {
				jogadores.remove(jog1);
				System.out.println("Jogador desligado.");
				return true;
			}
		}
		for (Jogador jog2 : jogadoresEscalados) {
			if (nome.equalsIgnoreCase(jog2.getNome())) {
				jogadoresEscalados.remove(jog2);
				if (jog2.getSituacao().equalsIgnoreCase("titular")) {
					contadorTitular--;
				} else if (jog2.getSituacao().equalsIgnoreCase("reserva")) {
					contadorReserva--;
				}
				System.out.println("Jogador desligado.");
				return true;
			}

		}
		System.out.println("Jogador não existe.");
		return false;

	}

	public boolean consultarJogador(String nome) {
		for (Jogador jog1 : jogadores) {
			if (nome.equalsIgnoreCase(jog1.getNome())) {
				System.out.println(jog1.toString());
				return true;
			}
		}

		for (Jogador jog2 : jogadoresEscalados) {
			if (nome.equalsIgnoreCase(jog2.getNome())) {
				System.out.println(jog2.toString());
				return true;
			}
		}

		System.out.println("Jogador nao encontrado.");
		return false;
	}

	public void calcularQuantidadeJogadores() {

		System.out.println(jogadores.size());
	}

	public void calcularQuantidadeJogadoresEscalados() {

		System.out.println(jogadoresEscalados.size());
	}

	public String listarJogadores() {

		for (Jogador jog : jogadores) {
			System.out.println(jog.toString());

		}
		return null;
	}

	public String listarJogadoresEscalados() {

		for (Jogador jog : jogadoresEscalados) {
			System.out.println(jog.toString());

		}
		return null;
	}

}