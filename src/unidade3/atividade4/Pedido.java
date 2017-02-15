package unidade3.atividade4;

import java.lang.reflect.Array;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Date;

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
	
	public String imprimirRelatorio() throws ParseException {
		String frase1 = "O cliente "+this.cliente.nome+" comprou os produtos ";
		String frase2 = null;
		for (int i=0;i<this.produtos.length;i++) {
			if (i==0) {
				frase2 = this.produtos[i].descricao;
			} else {
				frase2 = frase2 + ", " + this.produtos[i].descricao;
			}
		}
		String dataEmUmFormato = "2009-10-30";
		SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
		Date data = formato.parse(dataEmUmFormato);
		formato.applyPattern("dd/MM/yyyy");
		String dataFormatada = formato.format(data);
		System.out.println(dataFormatada);
		
		Date dataAtual = new Date();
		System.out.println(formato.format(dataAtual));
		
		String frase3 = " na data "+this.date+" para o endereço de entrega "+this.enderecoEntrega+".";
		return frase1+frase2+frase3;
	}
	
	
}
