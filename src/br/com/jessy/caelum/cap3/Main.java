package br.com.jessy.caelum.cap3;

public class Main {

	public static void main(String[] args) {
		questao2();
	}

	/*
	 * 2. Imprima a soma de 1 at� 1000.
	 * 
	 */
	public static void questao2() {

		int soma = 0;
		int x;

		for (x = 1; x <= 1000; x++) {
			soma = soma + x;
		}
		
		System.out.println("a soma � " + soma);
	}

	/*
	 * Imprima os primeiros n�meros da s�rie de Fibonacci at� passar de 100. A s�rie
	 * de Fibonacci � a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para
	 * calcul�-la, o primeiro elemento vale 0, o segundo vale 1, da� por diante, o
	 * n-�simo elemento vale o (n-1)-�simo elemento somado ao (n-2)- �simo elemento
	 * (ex: 8 = 5 + 3).
	 * 
	 */
	public static void questao6() {

		int elemento = 0;
		int sucessor = 1;

		System.out.println(elemento);
		System.out.println(sucessor);

		while (true) {

			int temp = sucessor;
			sucessor = elemento + sucessor;
			elemento = temp;

			System.out.println(sucessor);

			if (sucessor > 100) {
				break;
			}
		}

	}
}