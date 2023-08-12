// Classe base método por Herança (POO)

//Classe pai
class Funcionario {
	String nome;
	double salario;
	
	void calcularSalario(){
		//lógica para calcularSalario
	}
}

//subclasse ou classe filha

class gerente extends Funcionario {
	int nivelAcesso;
	
	void realizarTarefaGerencial(){
		//lógica para tarefas gerenciais
	}
}


//Classe base método por Abstração (POO)

abstract class Funcionarios {
	String nome;
	double salario;
	
	//Método sem implemntação
	abstract void calcularSalario();
}

class Gerente extends Funcionario {
	int nivelAcesso;
	
	@Override
	void calcularSalario() {
		//lógica específica para cálcular o salário de um gerente
	}
	
	void realizarTarefaGerencial() {
		//lógica para tarefas
	}
}


//Classe base método por Polimorfismo (POO)

class Vendedor extends Funcionario {
	double comissao;
	
	@Override
	void calcularSalario() {
	}
	
	void realizarVendas() {
		//lógica da tarefa
	}
}

//Classe base método por Encapsulamento (POO)

class Funcionario {
	private String nome;
	private doubel salario;
	
	//Outro método existente
	
	public String getNome() {
		return nome;
	}
	
	public doube getSalario() {
		return salario;
	}
	
	public void calcularSalario() {
	}
}
