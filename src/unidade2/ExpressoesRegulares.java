package unidade2;

public class ExpressoesRegulares {
	
	public static void main(String[] args) {
		String nome1 = "ficechin@hotmail.com";
		
		boolean ok = nome1.matches("\\S{1,}@\\S{1,}");

		if (ok) {
			System.out.println("E-mail v�lido!");
		} else {
			System.out.println("E-mail inv�lido!");
		}
		
		/* String nome2 = "f";
		
		boolean ok2 = nome2.matches("\\D");
		System.out.println("Retorno = "+ok2); /* 
		
		/*
		\d -> representa qualquer d�gito(n�mero)
		\D -> representa tudo, menos d�gito(n�mero)
		
		\w -> representa qualquer caractere de palavra
		\W -> representa tudo que n�o seja um caractere de palavra
		
		\s -> representa qualquer espa�o em branco(" ", tab)
		\S -> representa tudo que n�o seja espa�o em branco
		
		[a-z] -> representa qualquer letra min�scula do alfabeto
		[A-Z] -> representa qualquer letra mai�scula do alfabeto
		[a-zA-Z] -> representa qualquer letra do alfabeto, seja mai�scula ou min�scula
		| -> representa o 'ou'. "a|b" casa com 'a' ou com 'b', ou com os dois
		
		Vejamos alguns quantificadores
		. -> substitui qualquer caractere
		* -> o caractere anterior aparece nenhuma ou mais vezes
		+ -> o caractere anterior aparece uma ou mais vezes
		{a} -> o caractere anterior se repete 'a' vezes
		{a,} -> o caractere anterior se repete pelo menos 'a' vezes
		{a,b} -> o caractere anterior se repete entre 'a' e 'b' vezes
		
		
		A representa��o de d�gito � '\d', mas dentro de strings, para '\' valer, temos que escap�-la.
		Logo, podemos representar um CEP como: "\\d\\d\\d\\d\\d-\\d\\d\\d"
		Ou "\\d{5}-\\d{3}"
		 */
	}

}
