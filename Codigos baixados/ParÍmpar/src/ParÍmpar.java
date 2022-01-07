/*
	 * Elaborar um programa em Java que leia um número inteiro e exiba uma mensagem
	 * identificando se ele é um número par ou impar.
	 */


import java.util.Scanner;

/*Elaborar um programa em Java que leia um número inteiro e exiba uma mensagem identificando se ele é um número par ou impar.*/
public class ParÍmpar
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A;
		System.out.println("Informe um número");
		A=sc.nextInt();
		
		if(A%2==0)
		{
			System.out.println(A+"Número Par");
		}
		if(A%2==1)
		{
			System.out.println(A+"Numero Ímpar");
		}
		
		sc.close();
	}

}
