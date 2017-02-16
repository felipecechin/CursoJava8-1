package unidade4.sisalucar;

public class Onibus extends Veiculo {
	public int getPassageiros() { //exemplo de anulação
		return 40;
	}
	public void acelera(int limiteVelocidade) { //exemplo de sobrecarga
		System.out.println("Obedeça o limite de velocidade que é:"+limiteVelocidade);
	}
}
