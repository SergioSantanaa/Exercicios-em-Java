/*
	 * Elaborar um programa em Java que leia um n�mero inteiro e exiba uma mensagem
	 * identificando se ele � um n�mero par ou impar.
	 */


import java.util.Scanner;

/*Elaborar um programa em Java que leia um n�mero inteiro e exiba uma mensagem identificando se ele � um n�mero par ou impar.*/
public class Par�mpar
{

	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		int A;
		System.out.println("Informe um n�mero");
		A=sc.nextInt();
		
		if(A%2==0)
		{
			System.out.println(A+"N�mero Par");
		}
		if(A%2==1)
		{
			System.out.println(A+"Numero �mpar");
		}
		
		sc.close();
	}

}
