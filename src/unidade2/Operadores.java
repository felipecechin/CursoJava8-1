package unidade2;

import java.util.Scanner;

public class Operadores {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o 1° valor:");
		int numero1 = scn.nextInt();
		System.out.println("Digite o 2° valor:");
		int numero2 = scn.nextInt();
		
		System.out.println("O 1 valor é maior que o 2 valor?"+(numero1>numero2));
		System.out.println("O 1 valor é igual que o 2 valor?"+(numero1==numero2));
		System.out.println("O 1 valor é menor que o 2 valor?"+(numero1<numero2));
		/*
		int soma = numero1 + numero2;
		int subtracao = numero1 - numero2;
		int multiplicacao = numero1*numero2;
		float divisao = (float) numero1/numero2;
		
		System.out.println("Soma="+soma);
		System.out.println("S ubtração="+subtracao);
		System.out.println("Multiplicação="+multiplicacao);
		System.out.printf("Divisão=%.3f",divisao); */
		

	}

}
