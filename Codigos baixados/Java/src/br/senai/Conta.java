package br.senai;

public class Conta {

	int numero;
	String dono;
	double saldo;
	double limite;
	boolean ativa;
	int sacar;

	public void status() {
		System.out.println("O titular da conta : " + this.dono);
		System.out.println("O número da conta : " + this.numero);
		System.out.println("O limite da conta : " + this.limite);
		System.out.println("O saldo da conta é : " + this.saldo);

	}

	public void abrirConta() {
		this.ativa = true;
	}

	public void fecharConta() {
		this.ativa = false;
		if (this.saldo == 0) {
			System.out.println("Conta fechada com sucesso");
		} else {
			if (this.saldo > 0) {
				System.out.println("Saldo positivo, saque o valor = " + this.saldo + " para fechar a conta");
			} else {
				if (this.saldo < 0) {
					System.out.println(
							"Saldo negativo, Deposite o valor = " + (this.saldo * -1) + " para fechar esta conta");
				}
			}
		}
	}

	public void depositar(double valor) {
		if (this.ativa) {
			this.saldo += valor;
		} else {
			System.out.println("Não posso depositar em uma conta inativa.");
		}
	}

	public void consultarSaldo() {
		System.out.println("Seu saldo é de :" + this.saldo);

	}

	public void sacar() {
		if (!ativa) {
			System.out.println("Conta inativa");
		}
		if (this.ativa && sacar <= this.saldo + this.limite) {
			double sacar;
			this.sacar = (int) (this.sacar + this.saldo);
			if (this.sacar > 0) {
				System.out.println("Saque de " + this.sacar + " realizado com sucesso seu  agora saldo é de : "
						+ (this.sacar - this.saldo));
			} else {
				if (this.sacar < 0) {
					System.out.println("Saldo negativo, Deposite o valor = " + this.saldo + " para fechar esta conta");
				}

			}
		}

	}
}
