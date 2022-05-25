package Exe2;

public class Caminhao extends VeiculoPasseio {
	
	float capacidadeCarga;
	int eixos;
	public Caminhao(String placa, String cor, String modelo, String fabricante, int anoFab, float valDiaria,
			int numPortas, float capacidadeCarga, int eixos) {
		super(placa, cor, modelo, fabricante, anoFab, valDiaria, numPortas);
		this.capacidadeCarga = capacidadeCarga;
		this.eixos = eixos;
	
	
	}
	public float getCapacidadeCarga() {
		return capacidadeCarga;
	}
	public void setCapacidadeCarga(float capacidadeCarga) {
		this.capacidadeCarga = capacidadeCarga;
	}
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
		
	}

	
}
