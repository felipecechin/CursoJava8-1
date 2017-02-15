package unidade3.atividade4;

import java.text.ParseException;
import java.time.LocalDate;

public class Atividade4App {

	public static void main(String[] args) throws ParseException {
		Cliente cliente = new Cliente("Felipe", "Avenida Dores");
		Produto produto1 = new Produto("Caixa", 59.90);
		Produto produto2 = new Produto("Garrafa", 49.90);
		
		
		Pedido pedido = new Pedido(LocalDate.now(),cliente, produto1,produto2);
		System.out.println(pedido.imprimirRelatorio());
	}

}
