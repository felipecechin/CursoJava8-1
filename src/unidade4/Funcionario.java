package unidade4;

public class Funcionario {
	
	public static void main(String[] args) {
		Funcionario jose = new Funcionario();
		Funcionario antonio = new Professor();
		Funcionario andrea = new Administrativo();
		Funcionario pedro = new Diretor();
		((Diretor)pedro).departamento = "DDE";
		System.out.println(((Diretor)pedro).departamento);
		
		
		
		pedro.verificarTipoFuncionario(pedro);
		antonio.verificarTipoFuncionario(antonio);
	}
	
	public void verificarTipoFuncionario(Funcionario objeto) {
		if (objeto instanceof Diretor) {
			System.out.println("Diretor");
		} else if (objeto instanceof Professor) {
			System.out.println("Professor");
		} else {
			System.out.println("Administrativo");
		}
	}
}
