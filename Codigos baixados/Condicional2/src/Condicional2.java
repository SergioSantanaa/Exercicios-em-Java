import java.util.Scanner;
/*Elabore um progama que solicite ao usu�rio 10 n�meros inteiros e  mostre a soma dos n�meros pares e  m�dia dos n�meros impares*/
public class Condicional2
{

		
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			float j=0,n,soma=0,soma1=0;
			float media = 0;
			for (int j1 = 0; j1 < 10; j1++)
			{
				System.out.println("Digite  um n�mero");
				n=sc.nextInt();
				
				if(n%2==0)
				{
					
					soma= soma+n;					
				}
				else
				{
					if(n%2==1)
					{
						/* utilizando vari�vel j para identificar os impares e depois dividir  a soma 
						 * para achar m�dia*/
						j=j+1;
						soma1=soma1+n;
						media= soma1/j;
					}
				}
			
			}
			System.out.println(" Soma dos n�meros Pares: "+soma);
			System.out.println("M�dia dos n�meros �mpares: "+media);

		}
}





