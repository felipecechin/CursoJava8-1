package unidade4.sisalucar;

public class Onibus extends Veiculo {
	public int getPassageiros() { //exemplo de anula��o
		return 40;
	}
	public void acelera(int limiteVelocidade) { //exemplo de sobrecarga
		System.out.println("Obede�a o limite de velocidade que �:"+limiteVelocidade);
	}
}
