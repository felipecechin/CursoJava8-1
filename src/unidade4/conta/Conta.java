package unidade4.conta;

import unidade4.Cliente;

public class Conta {
	
	//atributos
	private int numero;
	protected double saldo;
	private double limite;
	private Cliente cliente[];
	
	//m�todos
	public boolean saca(double valor) {
		if (valor <= saldo) {
			saldo = saldo - valor;
			return true;
		} else {
			return false; //n�o conseguiu realizar o saque
		}
	}
	
	public void deposita(double valor) {
		saldo = saldo + valor;
	}
	
	public void transfere(Conta destino, double valor) {
		if (valor <= saldo) {
			this.saldo = this.saldo - valor;
			destino.deposita(valor);
		} else {
			System.out.println("N�o foi poss�vel realizar a transfer�ncia");
		}
	}
	
	public void atualiza(double taxa) {
		this.saldo = this.saldo + this.saldo*taxa;
	}
	
	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	public static void main(String[] args) {
		Conta conta = new Conta();
		conta.cliente = new Cliente[5]; //1 at� 5
		conta.setSaldo(1000);
		conta.atualiza(1.5333);
		System.out.println(conta.getSaldo());
	}
}
