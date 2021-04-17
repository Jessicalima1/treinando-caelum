package br.com.jessy.caelum.cap3.topico1;

import java.util.Scanner;

public class TesteIdade {

	public static void main(String[] args) {
		// imprime a idade
		int idade = 20;
		System.out.println(idade);
//		gera	uma	idade	no	ano	seguinte
		int idadeNoAnoQueVem;
		idadeNoAnoQueVem = idade + 1;
//		imprime	a	idade

		System.out.println(idadeNoAnoQueVem);

		int quatro = 2 + 2;
		int tres = 5 - 2;
		int oito = 4 * 2;
		int dezesseis = 64 / 4;
		int um = 5 % 2; // 5 dividido por 2 dá 2 e tem resto 1;
//			o	operador	%	pega	o	resto	da	divisão	inteira

		System.out.println(quatro);
		System.out.println(tres);
		System.out.println(oito);
		System.out.println(dezesseis);
		System.out.println(um);

		double pi = 3.14;
		double x = 5 * 10;

		System.out.println(pi);
		System.out.println(x);

		boolean verdade = true;

		System.out.println(verdade);

		int idadeh = 30;
		boolean menorDeIdade = idadeh < 18;

		System.out.println(menorDeIdade);

		char letra = 'a';
		System.out.println(letra);

	}

}
