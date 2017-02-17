package unidade4;

public class TesteCasting {
	public static void main(String[] args) {
		char a = 'a';
		int b = 'b';
		System.out.println(b);
		float c = 100;
		int d = (int) 5.1987; //casting (int)
		System.out.println(d);
		int f = (a+5); //converte o a para um número e soma
		System.out.println(f);
		char g = (char) 110.5; //casting (char)
		System.out.println(g);
		float e = (float) 5.0; //casting (float)
	}
}
