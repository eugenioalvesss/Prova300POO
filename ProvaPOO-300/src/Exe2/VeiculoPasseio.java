package Exe2;

public abstract class VeiculoPasseio {
	
	String placa;
	String cor;
	String modelo;
	String fabricante;
	int anoFab;
	float valDiaria;
	int numPortas;
	
	public VeiculoPasseio(String placa, String cor, String modelo, String fabricante, int anoFab, float valDiaria,
			int numPortas) {
		this.placa = placa;
		this.cor = cor;
		this.modelo = modelo;
		this.fabricante = fabricante;
		this.anoFab = anoFab;
		this.valDiaria = valDiaria;
		this.numPortas = numPortas;
		
	
	}

	public String getPlaca() {
		return placa;
	}

	public void setPlaca(String placa) {
		this.placa = placa;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getFabricante() {
		return fabricante;
	}

	public void setFabricante(String fabricante) {
		this.fabricante = fabricante;
	}

	public int getAnoFab() {
		return anoFab;
	}

	public void setAnoFab(int anoFab) {
		this.anoFab = anoFab;
	}

	public float getValDiaria() {
		return valDiaria;
	}

	public void setValDiaria(float valDiaria) {
		this.valDiaria = valDiaria;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	 public String imprimeDados() {
	        return "Placa: "+getPlaca()+" Cor: "+getCor()+" Modelo: "+getModelo()+
	                " Ano Fabricação: "+getAnoFab();
	
	
	
	 }
}

