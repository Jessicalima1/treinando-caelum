package br.com.jessy.caelum.cap4.banco;

public class Conta {

	public Cliente cliente;
	public int agencia;
	public int numeroConta;
	public int verificador;
	public double saldo;

	public void saque(double valor) {
		saldo = saldo - valor;
	}

	public void deposito(double valor) {
		saldo = saldo + valor;
	}

	public void transferencia(Conta conta, double valor) {
		saldo -= valor;
		conta.saldo += valor;

	}

	@Override
	public String toString() {
		return "Conta [cliente=" + cliente + ", agencia=" + agencia + ", numeroConta=" + numeroConta + ", verificador="
				+ verificador + ", saldo=" + saldo + "]";
	}

}
