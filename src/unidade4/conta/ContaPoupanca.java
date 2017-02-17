package unidade4.conta;

public class ContaPoupanca extends Conta {

	public void atualiza(double taxa) { //anulação
		super.saldo = super.saldo + super.saldo*3*taxa;
	}
}
