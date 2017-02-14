package unidade3.sisalucar;

public class Carro {
	long idCarro;
	String placa;
	String fabricante;
	String modelo;
	int ano;
	String cor;
	float valorDiaria;
	Revendedor revendedor;
	
	public Carro(long idCarro, String placa, String fabricante, String modelo, int ano, String cor, float valorDiaria, Revendedor revendedor) {
		super(); //chama o construtor da superclasse
		this.idCarro = idCarro;
		this.placa = placa;
		this.fabricante = fabricante;
		this.modelo = modelo;
		this.ano = ano;
		this.cor = cor;
		this.valorDiaria = valorDiaria;
		this.revendedor = revendedor;
	}
	
	public Carro(){
		
	}
	
	public static void main(String[] args) {
		Carro carro1 = new Carro(1,"ABC-2001","Volks","Gol",2013,"azul",99.90f,Revendedor.EMANUELVEICULOS);
		Carro carro2 = new Carro();
	}
	
	
}
