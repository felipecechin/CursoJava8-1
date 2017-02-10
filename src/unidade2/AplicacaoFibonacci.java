package unidade2;

public class AplicacaoFibonacci {

	public static void main(String[] args) {	
		int numero;
		int f1 = 0;
		int f2 = 0;
		int soma = 0;
		double media;
		for (int x=1;x<=20;x++) {
			if (x==1) {
				numero = x;
				f1 = numero;
			} else if (x==2) {
				numero = x-1;
				f2 = numero;
			} else {
				numero = f1 + f2;
				f1 = f2;
				f2 = numero;
			}
			soma = soma + numero;
			if (x==20) {
				System.out.print(numero+".");
			} else {
				System.out.print(numero+",");
			}
		
		}
		media = soma/20;
		System.out.println("");
		System.out.printf("A média dos 20 primeiros termos é: %.2f",media);
	}

}
