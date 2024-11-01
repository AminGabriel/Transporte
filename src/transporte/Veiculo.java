package transporte;

public abstract class Veiculo {
	String tipo;
	String placa;
	String marca;
	String modelo;
	int assentos;
	int anoDeFabricacao;
	double valorEstimado;
	double ipva;
	
	public Veiculo(String tipo, String placa, String marca, String modelo, int assentos, int anoDeFabricacao, double valorEstimado, double ipva) {
		this.tipo = tipo;
		this.placa = placa;
		this.marca = marca;
		this.modelo = modelo;
		this.assentos = assentos;
		this.anoDeFabricacao = anoDeFabricacao;
		this.valorEstimado= valorEstimado;
		this.ipva = ipva;
	}
	
	public abstract String valorEstimado(double valor, int anoAtual);

	public abstract String calcularIPVA();
	
	public String exibirDetalhes() {
		return "Tipo: " + this.getTipo() + "\nPlaca: " + this.getPlaca() + "\nMarca: " + this.getMarca() + "\nModelo: " + this.getModelo() + "\nAssentos totais:" + this.getAssentos() + "\nAno de fabricação: " + this.getAnoDeFabricacao() + "\nIPVA: R$" + this.getIpva() + "\nValor estimado: R$" +this.getValorEstimado() ;
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


	public String getPlaca() {
		return placa;
	}


	public void setPlaca(String placa) {
		this.placa = placa;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public int getAnoDeFabricacao() {
		return anoDeFabricacao;
	}


	public void setAnoDeFabricacao(int anoDeFabricacao) {
		this.anoDeFabricacao = anoDeFabricacao;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}



	public int getAssentos() {
		return assentos;
	}



	public void setAssentos(int assentos) {
		this.assentos = assentos;
	}

	public double getValorEstimado() {
		return valorEstimado;
	}

	public void setValorEstimado(double valorEstimado) {
		this.valorEstimado = valorEstimado;
	}

	public double getIpva() {
		return ipva;
	}

	public void setIpva(double ipva) {
		this.ipva = ipva;
	}
	
	
	
	

}
