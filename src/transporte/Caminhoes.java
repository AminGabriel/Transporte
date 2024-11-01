package transporte;

public class Caminhoes extends Veiculo{
	double CargaMax;
	double diferenca;

	public Caminhoes(String tipo, String placa, String marca, String modelo, int assentos, int anoDeFabricacao,
			double valorEstimado, double ipva, double cargaMax) {
		super(tipo, placa, marca, modelo, assentos, anoDeFabricacao, valorEstimado, ipva);
		CargaMax = cargaMax;
	}

	public String valorEstimado(double valor, int anoAtual) {
		diferenca = anoAtual - this.getAnoDeFabricacao();
		diferenca *= 5000;
		
		valor -= diferenca;
		if(valor > 0) {
			this.setValorEstimado(valor);
		}else {
			this.setValorEstimado(0);
		}
		
		return "Calculado com sucesso!";
	}
	
	public String calcularIPVA() {
		if(this.getMarca() == null || this.getMarca().trim().isEmpty() ) {
			return "Sem cadastro!";
		}else {
			this.setIpva(getValorEstimado() * 0.015); 
	    	return "IPVA: " + this.getIpva();
		}
    }
	
	public String exibirDetalhes() {
		if(this.getMarca() == null || this.getMarca().trim().isEmpty()) {
			return "Sem cadastro!";
		}else {
			return "Tipo: " + this.getTipo() + "\nPlaca: " + this.getPlaca() + "\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAssentos totais:" + this.getAssentos() + "\nAno de fabricação: " + this.getAnoDeFabricacao() + "\nIPVA: R$" + this.getIpva() + "\nCarga máxima: " + this.getCargaMax() + "\nValor estimado: R$ " + this.getValorEstimado();

		}
    }
	
	public boolean testeDouble(String valor) {
		try {
			Double.parseDouble(valor);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}
	
	public boolean testeInt(String anoAtual) {
		try {
			Integer.parseInt(anoAtual);
			return true;
		}catch(NumberFormatException e) {
			return false;
		}
	}

	public double getCargaMax() {
		return CargaMax;
	}

	public void setCargaMax(double cargaMax) {
		CargaMax = cargaMax;
	}
	
	
	

}
