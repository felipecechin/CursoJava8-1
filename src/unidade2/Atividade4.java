package unidade2;

import java.util.Scanner;

public class Atividade4 {
	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		int A = scn.nextInt();
		
		System.out.print("Digite um outro n�mero:");
		int B = scn.nextInt();
		int soma = 0;
		for (int i=A+1;i<B;i++) {
			soma = soma + i;
		}
		System.out.println("A soma dos n�meros entre "+A+" e "+B+" � "+soma);
	}
}
