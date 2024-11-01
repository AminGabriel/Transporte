package transporte;

public class Carro extends Veiculo{
	
	String modificacao;
	double diferenca;
	
	public Carro(String tipo, String placa, String marca, String modelo, int assentos, int anoDeFabricacao,
			double valorEstimado, double ipva, String modificacao) {
		super(tipo, placa, marca, modelo, assentos, anoDeFabricacao, valorEstimado, ipva);
		this.modificacao = modificacao;
	}

	public String valorEstimado(double valor, int anoAtual) {
		diferenca = anoAtual - this.getAnoDeFabricacao();
		diferenca *= 2000;
		
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
			this.setIpva(getValorEstimado() * 0.04); 
	    	return "IPVA: " + this.getIpva();
		}
    }
	
	public String exibirDetalhes() {
		if(this.getMarca() == null || this.getMarca().trim().isEmpty()) {
			return "Sem cadastro!";
		}else {
			return "Tipo: " + this.getTipo() + "\nPlaca: " + this.getPlaca() + "\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAssentos totais:" + this.getAssentos() + "\nAno de fabricação: " + this.getAnoDeFabricacao() + "\nIPVA: R$" + this.getIpva() + "\nModificação: " + this.getModificacao() + "\nValor estimado: R$" + this.getValorEstimado();

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


	public String getModificacao() {
		return modificacao;
	}


	public void setModificacao(String modificacao) {
		this.modificacao = modificacao;
	}
	
	
	
	


	

}
