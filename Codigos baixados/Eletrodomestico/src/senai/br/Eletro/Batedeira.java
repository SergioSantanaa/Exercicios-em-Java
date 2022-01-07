package senai.br.Eletro;

public class Batedeira extends Eletrodomesticos {
	 

	public Batedeira(String marca, double preco, double voltagem) {
		super(marca, preco, voltagem);

	}


	@Override
	public double desconto() {
		if(this.getPreco() > 0 ) {
	int novoPreco = (int) ((this.getPreco()/10)*2);
		
		}
		return 0;
	

	}

	
}


