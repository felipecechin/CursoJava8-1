package unidade4.conta;

public class ContaCorrente extends Conta {
	
	public void atualiza(double taxa) { //anulação
		super.saldo = super.saldo + super.saldo*2*taxa;
	}
}
