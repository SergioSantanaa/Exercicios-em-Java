import java.util.Scanner;

/*Elabore um progama que solicite ao usuário 10 números inteiros e depois mostre a quantidade de pares e impares*/
public class Condicional1
{

	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int j,n,par =0,impar=0;
		for (int j1 = 0; j1 < 10; j1++)
		{
			System.out.println("Informe um número");
			n=sc.nextInt();
			
			if(n%2==0)
			{
				j=1;
				par=par+j;
				
				
			}
			else
			{	
				j=1;
				impar=impar +j;
			}
		}
		System.out.println("Números Pares: "+par);
		System.out.println("Números Ímpares: "+impar);

	}

}
