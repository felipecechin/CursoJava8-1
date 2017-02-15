package unidade3.atividade4;

import java.lang.reflect.Array;
import java.time.LocalDate;
import java.util.Arrays;

public class Pedido {
	LocalDate date;
	String enderecoEntrega;
	Produto produtos[];
	Cliente cliente;
	
	public Pedido(LocalDate date,Cliente cliente,Produto ...produtos) {
		super();
		this.date = date;
		this.enderecoEntrega = cliente.endereco;
		this.cliente = cliente;
		this.produtos = produtos;
	}
	
	public String imprimirRelatorio() {
		String frase1 = "O cliente "+this.cliente.nome+" comprou os produtos ";
		String frase2 = null;
		for (int i=0;i<this.produtos.length;i++) {
			if (i==0) {
				frase2 = this.produtos[i].descricao;
			} else {
				frase2 = frase2 + ", " + this.produtos[i].descricao;
			}
		}
		String frase3 = " na data "+this.date+" para o endereço de entrega "+this.enderecoEntrega+".";
		return frase1+frase2+frase3;
	}
	
	
}
