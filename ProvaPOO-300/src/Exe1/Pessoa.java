package Exe1;

public class Pessoa {

	protected float peso;
	protected float altura;
	
	public Pessoa(float peso, float altura) {
		this.peso = peso;
		this.altura = altura;
	
	}
	
	

	public Pessoa() {

	}



	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}
	protected void andar () {
		System.out.println("Você é uma pessoa capaz de andar");
	}	
	protected void correr () {
			System.out.println("Você é uma pessoa capaz de correr");
	
	}
	
	
}
