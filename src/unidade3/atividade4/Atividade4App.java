package unidade3.atividade4;

import java.util.Date;

public class Atividade4App {

	public static void main(String[] args) {
		Cliente cliente = new Cliente("Felipe", "Avenida Dores");
		Produto produto1 = new Produto("Caixa", 59.90);
		Produto produto2 = new Produto("Garrafa", 49.90);
		
		Date dataAtual = new Date();
		Pedido pedido = new Pedido(dataAtual,cliente, produto1,produto2);
		System.out.println(pedido.imprimirRelatorio());
	}

}
