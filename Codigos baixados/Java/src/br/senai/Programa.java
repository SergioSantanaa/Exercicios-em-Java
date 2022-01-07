package br.senai;

import java.util.Date;

public class Programa {

	public static void main(String[] args) {
		
		Conta minhaConta = new Conta();
		Conta minhaConta2 = new Conta();
		
		minhaConta.abrirConta();
		minhaConta.dono = "Sérgio";
		minhaConta.limite = 1000;
		minhaConta.numero = 0001;
		minhaConta.saldo = 20000;
		minhaConta.depositar(500);
		minhaConta.status();
		minhaConta.consultarSaldo();
		minhaConta.sacar();
		minhaConta.saldo=0;
		minhaConta.fecharConta();
		minhaConta.depositar(1500);
	
		
		
		
		
		minhaConta2.abrirConta();
		minhaConta2.dono = "Paulo";
		minhaConta2.limite = 400;
		minhaConta2.numero = 0002;
		minhaConta2.saldo = -600;
		minhaConta2.depositar(500);
		minhaConta2.status();
		minhaConta2.consultarSaldo();
		minhaConta2.sacar();
		minhaConta2.depositar(100);
		minhaConta2.fecharConta();
		
		
	}

}