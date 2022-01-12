package br.andrey.dio;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int a, b;
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();

		int soma = soma(a, b);
		int subtracao = subtracao(a, b);
		int multiplicacao = multiplicacao(a,b);
		double divisao = divisao(a,b);
		
		System.out.println("A soma dos valores � " + soma);
		System.out.println("A subtra��o dos valores � " + subtracao);
		System.out.println("A multiplica��o dos valores � " + multiplicacao);
		System.out.println("A divis�o dos valores � " + divisao);
		
		scan.close();

	}

	public static int soma(int a, int b) {
		return a + b;
	}

	public static int subtracao(int a, int b) {
		return a - b;
	}

	public static int multiplicacao(int a, int b) {
		return a * b;
	}

	public static double divisao(int a, int b) {
		return a / b;
	}

}
