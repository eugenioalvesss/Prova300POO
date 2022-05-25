package Exe2;

public class VeiculoUtilitario extends VeiculoPasseio {
	
	String tracao;
	String tipo;
	int numPortas;
	
	public VeiculoUtilitario(String placa, String cor, String modelo, String fabricante, int anoFab, float valDiaria,
			int numPortas, String tracao, String tipo, int numPortas2) {
		super(placa, cor, modelo, fabricante, anoFab, valDiaria, numPortas);
		this.tracao = tracao;
		this.tipo = tipo;
		numPortas = numPortas2;
		
		
	}

	public String getTracao() {
		return tracao;
	}

	public void setTracao(String tracao) {
		this.tracao = tracao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public int getNumPortas() {
		return numPortas;
	}

	public void setNumPortas(int numPortas) {
		this.numPortas = numPortas;
	}
	
	
	

}
