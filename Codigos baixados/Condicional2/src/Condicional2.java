import java.util.Scanner;
/*Elabore um progama que solicite ao usuário 10 números inteiros e  mostre a soma dos números pares e  média dos números impares*/
public class Condicional2
{

		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			float j=0,n,soma=0,soma1=0;
			float media = 0;
			for (int j1 = 0; j1 < 10; j1++)
			{
				System.out.println("Digite  um número");
				n=sc.nextInt();
				
				if(n%2==0)
				{
					
					soma= soma+n;					
				}
				else
				{
					if(n%2==1)
					{
						/* utilizando variável j para identificar os impares e depois dividir  a soma 
						 * para achar média*/
						j=j+1;
						soma1=soma1+n;
						media= soma1/j;
					}
				}
			
			}
			System.out.println(" Soma dos números Pares: "+soma);
			System.out.println("Média dos números Ímpares: "+media);

		}
}





