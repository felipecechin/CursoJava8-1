package unidade3;

public class Atividade1 {
	String nome = "O Curso de Java";
	String avaliacao = "é ótimo!";
	
	public String imprimir() {
		return this.nome+" "+this.avaliacao;
	}
	public String extrair() {
		return this.nome.substring(11);
	}
	
	public static void main(String[] args) {
		Atividade1 atividade = new Atividade1();
		System.out.println(atividade.imprimir());
		System.out.println(atividade.extrair());
	}

}
