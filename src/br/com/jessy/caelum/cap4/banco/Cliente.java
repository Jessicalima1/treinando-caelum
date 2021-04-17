package br.com.jessy.caelum.cap4.banco;

public class Cliente {

	public String nome;
	public int cpf;
	public double renda;
	public char genero;
	public boolean isVip;

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cpf=" + cpf + ", renda=" + renda + ", genero=" + genero + ", isVip=" + isVip
				+ "]";
	}

}
