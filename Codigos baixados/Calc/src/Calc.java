
import java.util.Scanner;

/*Crie uma calculadora com opera��es basicas (+,-,*,/) 
	// onde o user digite dois numeros e logo ap�s digite a 
	// op��o(int) com a opera��o a ser efetuada*/
public class Calc {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int a,b,op,soma=0 ,div=0, multi=0,sub=0;
		
		System.out.println("Informe um n�mero");
		a=sc.nextInt();
		
		System.out.println("Informe um n�mero");
		b=sc.nextInt();
		System.out.println("Escolha uma opc�o de c�lculo :\n1-soma\n2-divis�o\n3-multiplica��o\n4-subtra��o");
		op=sc.nextInt();
		
		
		
		
		switch (op) {
		case 1:
			soma=a+b;
			System.out.println("O resultado da soma � : "+soma);
			
			break;
		case 2:
			div=a/b;
			System.out.println("O resultado da divis�o � : "+div);
			
			break;
		case 3:
			multi=a*b;
			System.out.println("O resultado da multiplica��o � : "+multi);
			
			break;
		case 4:
			sub=a-b;
			System.out.println("O resultado da subtra��o � : "+sub);
			
			break;

		default:
			System.out.println("Op��o inv�lida");
			break;
		}

	}

}
