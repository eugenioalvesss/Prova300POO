package Exe2;

public class Motocicleta extends VeiculoPasseio {
	
	int potencia;
	String tipo;
	public Motocicleta(String placa, String cor, String modelo, String fabricante, int anoFab, float valDiaria,
			int numPortas, int potencia, String tipo) {
		super(placa, cor, modelo, fabricante, anoFab, valDiaria, numPortas);
		this.potencia = potencia;
		this.tipo = tipo;
		
	
	}
	public int getPotencia() {
		return potencia;
	}
	public void setPotencia(int potencia) {
		this.potencia = potencia;
	}
	public String getTipo() {
		return tipo;
	}
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	

}
