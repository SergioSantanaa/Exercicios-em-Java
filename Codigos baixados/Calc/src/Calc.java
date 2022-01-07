
import java.util.Scanner;

/*Crie uma calculadora com operações basicas (+,-,*,/) 
	// onde o user digite dois numeros e logo após digite a 
	// opção(int) com a operação a ser efetuada*/
public class Calc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,op,soma=0 ,div=0, multi=0,sub=0;
		
		System.out.println("Informe um número");
		a=sc.nextInt();
		
		System.out.println("Informe um número");
		b=sc.nextInt();
		System.out.println("Escolha uma opcão de cálculo :\n1-soma\n2-divisão\n3-multiplicação\n4-subtração");
		op=sc.nextInt();
		
		
		
		
		switch (op) {
		case 1:
			soma=a+b;
			System.out.println("O resultado da soma é : "+soma);
			
			break;
		case 2:
			div=a/b;
			System.out.println("O resultado da divisão é : "+div);
			
			break;
		case 3:
			multi=a*b;
			System.out.println("O resultado da multiplicação é : "+multi);
			
			break;
		case 4:
			sub=a-b;
			System.out.println("O resultado da subtração é : "+sub);
			
			break;

		default:
			System.out.println("Opção inválida");
			break;
		}

	}

}
