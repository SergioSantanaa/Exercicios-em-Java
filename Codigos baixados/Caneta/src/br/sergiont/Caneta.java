package br.sergiont;

public class Caneta {
	public String modelo;
	private double ponta;
	private String cor;
	private boolean tampada;
	
	
	public Caneta (String modelo, String cor,double ponta) {
		this.tampada = true;
		this.cor = cor;
		this.ponta = ponta;
		this.modelo = modelo;
		
	}

	public String getModelo() {
		return modelo;

	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public double getPonta() {
		return  ponta;
	}

	public void setPonta(double ponta) {
		this.ponta = ponta;
	}
	 public void status() {
		 System.out.println("Sobre a caneta ");
		 System.out.println("Modelo: "+this.modelo);
		 System.out.println("Ponta: "+this.ponta);
		 System.out.println("Tem a cor "+this.cor);
		 System.out.println("Tampada: "+this.tampada);
	 }
}
