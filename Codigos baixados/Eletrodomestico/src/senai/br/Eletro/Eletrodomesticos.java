package senai.br.Eletro;

abstract class Eletrodomesticos {
	String marca;
	private double preco;
	private double voltagem;
	private int dezembro;
	private int maio;
	private int agosto;

	public Eletrodomesticos(String marca, double preco, double voltagem) {
		super();
		this.marca = marca;
		this.preco = preco;
		this.voltagem = voltagem;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public double getVoltagem() {
		return voltagem;
	}

	public void setVoltagem(double voltagem) {
		this.voltagem = voltagem;
	}

	public  void mes(int mes) {
		if(mes==12) {
			 dezembro = mes; 
			System.out.println("Dezembro");
		}else {
			if(mes==5) {
				maio = mes;
				System.out.println("Maio");
			}else {
				agosto = mes;
				System.out.println("Agosto");
			}
		}

	}

	public String toString() {
		return "Eletrodomesticos [marca=" + marca + ", preco=" + preco + ", voltagem=" + voltagem + "]";
	}
	
	

	public double desconto() {
		
		return 0;
	}
}
