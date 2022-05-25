package Exe1;

public class Aluno extends Pessoa {
	
	protected int matricula;

	public Aluno(float peso, float altura, int matricula) {
		this.matricula = matricula;
	}

	public Aluno(float peso, float altura) {
		super(peso, altura);
	}
	

}
