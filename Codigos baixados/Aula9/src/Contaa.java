
public class Contaa {
	int numero;
	String dono;
	double saldo;
	double limite;
	
	public void status () {
		System.out.println("Titular da conta " + this.dono);
		System.out.println("Número da conta " + this.numero);
		System.out.println("Saldo da conta " + this.saldo);
		System.out.println("Limite da conta " + this.limite);
	}
}
