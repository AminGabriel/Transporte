package transporte;

public class Onibus extends Veiculo{
	int assentosPreferenciais;
	double diferenca;
	
	public Onibus(String tipo, String placa, String marca, String modelo, int assentos, int anoDeFabricacao,
			double valorEstimado, double ipva, int assentosPreferenciais) {
		super(tipo, placa, marca, modelo, assentos, anoDeFabricacao, valorEstimado, ipva);
		this.assentosPreferenciais = assentosPreferenciais;
	}

	public String valorEstimado(double valor, int anoAtual) {
		diferenca = anoAtual - this.getAnoDeFabricacao();
		diferenca *= 3000;
		
		valor -= diferenca;
		if(valor > 0) {
			this.setValorEstimado(valor);
		}else {
			this.setValorEstimado(0);
		}
		
		
		
		return "Calculado com sucesso!";
	}
	
	public String calcularIPVA() {
		if(this.getMarca() == null || this.getMarca().trim().isEmpty()) {
			return "Sem cadastro!";
		}else {
			this.setIpva(getValorEstimado() * 0.02); 
	    	return "IPVA: " + this.getIpva();
		}
    }
	
	public String exibirDetalhes() {
		if(this.getMarca() == null || this.getMarca().trim().isEmpty()) {
			return "Sem cadastro!";
		}else {
			return "Tipo: " + this.getTipo() + "\nPlaca: " + this.getPlaca() + "\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAssentos totais:" + this.getAssentos() + "\nAno de fabricação: " + this.getAnoDeFabricacao() + "\nIPVA: R$" + this.getIpva() + "\nAssentos preferênciais: " + this.getAssentosPreferenciais() + "\nValor Estimado: R$" + this.getValorEstimado();

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

	public int getAssentosPreferenciais() {
		return assentosPreferenciais;
	}

	public void setAssentosPreferenciais(int assentosPreferenciais) {
		this.assentosPreferenciais = assentosPreferenciais;
	}
	
	
	

}
