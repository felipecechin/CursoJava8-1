package unidade2;

import java.util.Scanner;

public class Atividade2 {

	public static void main(String[] args) {
		int matriz[][] = new int[4][4];
		int c1 = (matriz.length*matriz[0].length);
		int indice = c1*(c1-1);
		int vetor[] = new int[indice];
		int vetorCont[] = new int[indice];
		int k = 0;
		
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
									//System.out.println(k+"-"+matriz[i][j]+"-"+matriz[x][y]);
									vetor[k] = matriz[i][j];
									k++;
								}
							} 
					}
				}
			}
		}
		for (int i=0;i<vetor.length;i++) {
			for (int j=0;j<vetor.length;j++) {
				if (i!=j) {
					if (vetor[i]==vetor[j]) {
						vetor[j] = 0;
					}
				}
			}
		}
		
		
		for (int i=0;i<matriz.length;i++) {
			for (int j=0;j<matriz[0].length;j++) {
				for (int t=0;t<vetor.length;t++) {
					if (matriz[i][j] == vetor[t]) {
						vetorCont[t]++;
					}
				}
			}
		}
		
		for (int i=0;i<vetor.length;i++) {
			if (vetor[i]!=0) {	
				System.out.println("O número "+vetor[i]+" se repete "+vetorCont[i]+" vezes");
			}
		}
		
	}

}
