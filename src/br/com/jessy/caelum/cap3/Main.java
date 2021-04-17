package br.com.jessy.caelum.cap3;

public class Main {

	public static void main(String[] args) {
		questao2();
	}

	/*
	 * 2. Imprima a soma de 1 até 1000.
	 * 
	 */
	public static void questao2() {

		int soma = 0;
		int x;

		for (x = 1; x <= 1000; x++) {
			soma = soma + x;
		}
		
		System.out.println("a soma é " + soma);
	}

	/*
	 * Imprima os primeiros números da série de Fibonacci até passar de 100. A série
	 * de Fibonacci é a seguinte: 0, 1, 1, 2, 3, 5, 8, 13, 21, etc... Para
	 * calculá-la, o primeiro elemento vale 0, o segundo vale 1, daí por diante, o
	 * n-ésimo elemento vale o (n-1)-ésimo elemento somado ao (n-2)- ésimo elemento
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