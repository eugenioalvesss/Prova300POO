package Exe2;

public class Van extends VeiculoPasseio {
	
	int passageiros;
	int eixos;
	public Van(String placa, String cor, String modelo, String fabricante, int anoFab, float valDiaria, int numPortas,
			int passageiros, int eixos) {
		super(placa, cor, modelo, fabricante, anoFab, valDiaria, numPortas);
		this.passageiros = passageiros;
		this.eixos = eixos;
		
	
	}
	public int getPassageiros() {
		return passageiros;
	}
	public void setPassageiros(int passageiros) {
		this.passageiros = passageiros;
	}
	public int getEixos() {
		return eixos;
	}
	public void setEixos(int eixos) {
		this.eixos = eixos;
	}
	
	

}
