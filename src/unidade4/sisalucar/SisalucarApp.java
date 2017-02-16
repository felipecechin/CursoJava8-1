package unidade4.sisalucar;

import java.time.LocalDate;

public class SisalucarApp {
	
	static int totalCarros = 0;
	
	public static void main(String[] args) {
		
		Carro carro1 = new Carro(); //objeto carro
		carro1.setIdCarro(1);
		carro1.setModelo("gol");
		carro1.setPlaca("jdk-0001");
		carro1.setCor("azul");
		carro1.setAno(2013);
		carro1.setValorDiaria(99.90f);
		carro1.setFabricante("volkswagen");
		SisalucarApp.totalCarros = SisalucarApp.totalCarros + 1; // ou totalCarros = totalCarros + 1;
		
		
		//Carro carro2 = new Carro();
		
		Cliente cliente1 = new Cliente();
		cliente1.setIdCliente(1);
		cliente1.setCpf("12345678-90");
		cliente1.setNome("João Pedro");
		cliente1.setCnh("XYZ0001");
		
		//Cliente cliente2 = new Cliente();
		SisalucarApp sisalucar = new SisalucarApp();
		sisalucar.realizarLocacao(carro1.getIdCarro(), cliente1.getIdCliente(), carro1.getValorDiaria());
		
		gerarRelatorioLocacao(carro1,LocalDate.now(),LocalDate.now().plusDays(5)); //datas como parametro, método estático
	}
	
	public void realizarLocacao(long idCarro, long idCliente, float valorDiaria) {
		Locacao locacao = new Locacao();
		locacao.setIdCarro(idCarro);
		locacao.setIdCliente(idCliente);
		locacao.setIdLocacao(1);
		locacao.setDatainicial(LocalDate.now());
		locacao.setDatafinal(LocalDate.now().plusDays(2));
		locacao.setValorLocado(2 * valorDiaria);
	}
	
	public static void gerarRelatorioLocacao(Carro carro1,LocalDate ...datas) { //exemplo de varargs
		float totalFaturado = carro1.getValorDiaria();
	}

}
