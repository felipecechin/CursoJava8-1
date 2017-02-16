package unidade4.sisalucar;

public class Moto extends Veiculo {
	public int getPassageiros() { //exemplo de anulação
		return 1;
	}
	public void acelera(int limiteVelocidade) { //exemplo de sobrecarga
		System.out.println("Obedeça o limite de velocidade que é:"+limiteVelocidade);
	}
}
