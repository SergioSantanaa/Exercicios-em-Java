/*
	 * Elaborar um programa em Java que solicite um valor do usu�rio e devolva o seu
	 * sucessor e o antecessor
	 */



import java.util.Scanner;

public class SucessorAntecessor 
{

	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int a;
		System.out.println("Informe um numero");
		a=sc.nextInt();
		
		if(a>0)
		{
			System.out.println("Seu sucessor �:"+(a+1)+"\nE o antecessor �:"+(a-1));
		}
		
	}

}
