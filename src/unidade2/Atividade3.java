package unidade2;

import java.util.Scanner;

public class Atividade3 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite um n�mero:");
		int fim = scn.nextInt();
		float harmonic = 0;
		for (int i=1;i<=fim;i++) {
			harmonic = harmonic + (1f/i);
		}
		System.out.printf("A s�rie harm�nica � %.2f",harmonic);
		
	}

}
