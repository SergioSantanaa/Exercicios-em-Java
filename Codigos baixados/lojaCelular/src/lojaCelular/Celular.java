package lojaCelular;

class Celular {
	private String marca;
	private String modelo;
	private String cor;
	private double valor;
	private Capa capa;

	public Celular(String cor, String modelo, String marca, double valor, Capa capa) {
		super();
		this.cor = cor;
		this.modelo = modelo;
		this.marca = marca;
		this.valor = valor;
		this.capa = capa;
	}

	public void imprimirTela() {
		System.out.println("O preço do celular" + getModelo() + " com capa " + capa.getCorCapa() + " de "
				+ capa.getMaterial() + "Fica por:$ " + calcValor());
	}

	public double calcValor() {
		return valor + capa.getPrecoCapa();
	}

	public String getMarca() {
		return this.marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return this.modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public String getCor() {
		return this.cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public double getValor() {
		return this.valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}

}
