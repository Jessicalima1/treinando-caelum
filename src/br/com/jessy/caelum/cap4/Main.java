package br.com.jessy.caelum.cap4;

import br.com.jessy.caelum.cap4.banco.Cliente;
import br.com.jessy.caelum.cap4.banco.Conta;

public class Main {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		Cliente c2 = new Cliente();

		String nomeCompleto = "Antonio Da Silva";
		int numeroDocumento = 987654321;
		double renda = 2000;
		char genero = 'M';
		boolean isVip = true;

		c1.nome = "Jessy";
		c1.cpf = 1234567890;
		c1.renda = 2999.90;
		c1.genero = 'F';
		c1.isVip = false;

		System.out.println(c1);

		c2.nome = nomeCompleto;
		c2.cpf = numeroDocumento;
		c2.renda = renda;
		c2.genero = genero;
		c2.isVip = isVip;

		System.out.println(c2);

		Conta conta1 = new Conta();
		Conta conta2 = new Conta();

		conta1.cliente = c1;
		conta2.cliente = c2;
		conta1.saldo = 1000;
		conta2.saldo = 200;

		System.out.println(conta1);
		System.out.println(conta2);

		conta1.saque(500);
		conta2.deposito(100);
		conta2.transferencia(conta1, 400);

		System.out.println(conta1);
		System.out.println(conta2);
	}

}
