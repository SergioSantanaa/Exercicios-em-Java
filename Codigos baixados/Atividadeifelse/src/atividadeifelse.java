
/*
	 * - Elaborar um programa em Java que: Solicite que o usuário digite 2 números.
	 * Decida qual deles é o maior e exiba na tela o resultado da seguinte
	 * maneira:“Maior = [número] / Menor = [número]” Caso os dois sejam iguais,
	 * deverá exibir como resultado:“Os números são iguais!”.
	 */
import java.util.Scanner;

public class atividadeifelse
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		System.out.println("Informe um número");
		n1=sc.nextInt();
		System.out.println("Informe outro número");
		n2=sc.nextInt();
		
		if(n1>n2)
		{
			System.out.println("Maior = "+n1+ "\nMenor = " +n2);
		}
		else
		{
			if(n2>n1)
			{
				System.out.println("Maior = "+n2+ "\nMenor = " +n1);

			}
		}
		if(n1==n2)
		{
			System.out.println("Os números são iguais");
		}
		sc.close();

	}
}
