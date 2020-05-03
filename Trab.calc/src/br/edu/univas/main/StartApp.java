package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		float opcao = 0, x, y, z;
		String operacao = "Nula";

		while (true) {
			System.out.println("Bem vindo, para começar digite a opção");
			System.out.println("Digite 1 para Somar");
			System.out.println("Digite 2 para Subtrair");
			System.out.println("Digite 3 para Multiplicar");
			System.out.println("Digite 4 para Dividir");
			System.out.println("Digite 9 para Sair");

			opcao = leitura.nextInt();
			if (opcao == 1) {
				operacao = ("soma");
				System.out.println("Por favor, digite o primeiro número");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo número");
				y = leitura.nextFloat();
				z = x + y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " é igual a: " + z);

			} else if (opcao == 2) {
				operacao = ("Subtração");
				System.out.println("Por favor, digite o primeiro número");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo número");
				y = leitura.nextFloat();
				z = x - y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " é igual a: " + z);

			} else if (opcao == 3) {
				operacao = ("Multiplicação");
				System.out.println("Por favor, digite o primeiro número");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo número");
				y = leitura.nextFloat();
				z = x * y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " é igual a: " + z);

			} else if (opcao == 4) {
				operacao = ("Divisão");
				System.out.println("Por favor, digite o primeiro número");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo número");
				y = leitura.nextFloat();
				z = x / y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " é igual a: " + z);
			} else if (opcao == 9) {
			} else {
				System.out.println("Opção inválida! Por favor, digite uma opção correta!");

			}
			if (opcao == 9) {
				System.exit(0);
				leitura.close();
			}
			System.out.println(" ");
			System.out.println("========================================================");
			System.out.println(" ");

		}
	}

}
