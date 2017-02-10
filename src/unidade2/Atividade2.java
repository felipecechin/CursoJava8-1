package unidade2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int matriz[][] = new int[2][2];
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				Scanner scn = new Scanner(System.in);
				System.out.print("Digite um número"+"["+i+"]["+j+"]:");
				matriz[i][j] = scn.nextInt();
			}
		}
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				for (int x=0;x<matriz.length;x++) {
					for (int y=0;y<matriz[0].length;y++) {
							if ((i!=x) || (j!=y)) {
								if (matriz[i][j]==matriz[x][y]) {
									System.out.println("O número "+matriz[i][j]+" se repete");
								}
							} 
					}
				}
			}
		}
	}

}
