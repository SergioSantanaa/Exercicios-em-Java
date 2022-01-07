//Continuar o algoritmo para exibir o nome e idade do usuário solicitando a ele a dia mês e ano de nascimento.

package br.senai.idade;

import java.util.Calendar;
import java.util.Scanner;

public class Idade {

	public static void main(String[] args) {
		Calendar hoje = Calendar.getInstance();
		int dia = hoje.get(Calendar.DAY_OF_MONTH);
		int mes = hoje.get(Calendar.MONTH);
		int ano = hoje.get(Calendar.YEAR);

		String nome;
		int dia1;
		int mes1;
		int ano1;
		int idade = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Informe seu nome ");
		nome = sc.nextLine();
		System.out.println("Informe o dia do seu nascimento");
		dia1 = sc.nextInt();
		System.out.println("Informe o mês ");
		mes1 = sc.nextInt();
		System.out.println("Agora o ano");
		ano1 = sc.nextInt();
		if ((dia1 < dia) && (mes1 < mes)) {
			idade = (ano - ano1);
			System.out.println("Olá " + nome + " sua idade é: " + idade);
		} else {
			if ((dia1 >= dia) && (mes1 >= mes)) {
				idade = (ano - ano1) - 1;
				System.out.println("Olá " + nome + " sua idade é: " + idade);
			}
		}
	}

}
