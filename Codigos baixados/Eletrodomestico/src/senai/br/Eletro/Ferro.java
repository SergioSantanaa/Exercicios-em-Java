package senai.br.Eletro;

public class Ferro extends Eletrodomesticos {

	public Ferro(String marca, double preco, double voltagem) {
		super(marca, preco, voltagem);
		
	}
	@Override
	public double desconto() {
		if(this.getPreco() > 0 ) {
	int novoPreco = (int) ((this.getPreco()/10)*1.5);
		
		}
		return 0;

}
}