
/*
	 * - Elaborar um programa em Java que: Solicite que o usu�rio digite 2 n�meros.
	 * Decida qual deles � o maior e exiba na tela o resultado da seguinte
	 * maneira:�Maior = [n�mero] / Menor = [n�mero]� Caso os dois sejam iguais,
	 * dever� exibir como resultado:�Os n�meros s�o iguais!�.
	 */
import java.util.Scanner;

public class atividadeifelse
{

	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		int n1,n2;
		System.out.println("Informe um n�mero");
		n1=sc.nextInt();
		System.out.println("Informe outro n�mero");
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
			System.out.println("Os n�meros s�o iguais");
		}
		sc.close();

	}
}
