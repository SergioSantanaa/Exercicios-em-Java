package ifelse;

import java.util.Scanner;

public class ifelse {

	public static void main(String[] args) 
	{
		
		Scanner sc = new Scanner(System.in);
		
		float n1,n2,n3,n4,media;
		String nome;
		
		System.out.println("Informe o nome do aluno");
		nome=sc.nextLine();
		
		System.out.println("Informe a 1� nota  do aluno");
		n1=sc.nextFloat();
		
		System.out.println("Informe a 2� nota  do aluno");
		n2=sc.nextFloat();
		
		System.out.println("Informe a 3� nota  do aluno");
		n3=sc.nextFloat();
		
		System.out.println("Informe a 4� nota  do aluno");
		n4=sc.nextFloat();
		
		media = (n1+n2+n3+n4)/4;
		
		System.out.println("A nota do aluno " +nome+ " � igual: "+media);
		
		System.out.println((media>=7)? "Aluno aprovado" : "Aluno reprovado");

	}