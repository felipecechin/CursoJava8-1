package unidade4.conta;

public class ContaCorrente extends Conta {
	
	public void atualiza(double taxa) { //anula��o
		super.saldo = super.saldo + super.saldo*2*taxa;
	}
}
