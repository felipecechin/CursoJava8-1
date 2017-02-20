package unidade4.atividade2;

public class Atividade2App {
	public static void main(String[] args) {
		Figura figura = new Circulo();
		Figura figura2 = new Quadrado();
		Desenhista desenhista = new Desenhista();
		desenhista.geraFigura(figura.desenha());
	}
}
