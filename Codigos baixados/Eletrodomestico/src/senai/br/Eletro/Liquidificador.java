package senai.br.Eletro;

public class Liquidificador extends Eletrodomesticos {
	
	public Liquidificador(String marca, double preco, double voltagem) {
		super(marca, preco, voltagem);
	}

	
	
	@Override
	public double desconto() {
		if(this.getPreco() > 0 ) {
	int novoPreco = (int) ((this.getPreco()/10)*1);
		
		}
		return 0;
}
}
