package unidade3;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		Scanner scn = new Scanner(System.in);
		System.out.print("Digite uma data:");
		String data = scn.next();
		String separaData[] = data.split("/");
		System.out.println("Dia:"+separaData[0]);
		System.out.println("Mês:"+separaData[1]);
		System.out.println("Ano:"+separaData[2]);
	}

}
