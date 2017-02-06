package unidade2;

import java.util.Scanner;

public class AplicacaoExpoente {

	public static void main(String[] args) {
		
		double e = 0;
		Scanner scn = new Scanner(System.in);
		System.out.println("Digite o valor de x:");
		double x = scn.nextDouble();
		
		for (int y=1;y<=50;y++) {
			e = e + (Math.pow(x, y)/y);
		}
		
		System.out.printf("O valor de e(x)=%.2f",e);
	}

}
