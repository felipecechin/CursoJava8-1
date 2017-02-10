package unidade2;

import java.util.Scanner;

public class Fatorial {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite um número: ");
		int numero = scn.nextInt();
		int fatorial = 1;
		
		for (int i=1;i<=numero;i++) {
			fatorial = fatorial * i;
		}
		System.out.println("O fatorial do número "+numero+" é "+fatorial);
	}

}
