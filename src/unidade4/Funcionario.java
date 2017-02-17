package unidade4;

public abstract class Funcionario {
	
	public static void main(String[] args) {
	
		Funcionario antonio = new Professor(); 	//polimorfismo
		Funcionario andrea = new Administrativo(); 	//polimorfismo
		Funcionario pedro = new Diretor(); 	//polimorfismo
		((Diretor)pedro).departamento = "DDE";
		System.out.println(((Diretor)pedro).departamento);
		
		
		pedro.verificarTipoFuncionario(pedro);
		antonio.verificarTipoFuncionario(antonio);
		
		Professor prof = new Professor();
		Autenticavel aut = prof; //interface recebendo referência de um objeto
		Cidadao cidadao = prof; //interface recebendo referência de um objeto
		Contribuinte contribuinte = prof; //interface recebendo referência de um objeto
	}
	
	public abstract void getBonificacao();
	
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
