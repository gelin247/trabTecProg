package br.edu.univas.main;

import java.util.Scanner;

public class StartApp {
	public static void main(String[] args) {
		Scanner leitura = new Scanner(System.in);

		float opcao = 0, x, y, z;
		String operacao = "Nula";

		while (true) {
			System.out.println("Bem vindo, para come�ar digite a op��o");
			System.out.println("Digite 1 para Somar");
			System.out.println("Digite 2 para Subtrair");
			System.out.println("Digite 3 para Multiplicar");
			System.out.println("Digite 4 para Dividir");
			System.out.println("Digite 9 para Sair");

			opcao = leitura.nextInt();
			if (opcao == 1) {
				operacao = ("soma");
				System.out.println("Por favor, digite o primeiro n�mero");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo n�mero");
				y = leitura.nextFloat();
				z = x + y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " � igual a: " + z);

			} else if (opcao == 2) {
				operacao = ("Subtra��o");
				System.out.println("Por favor, digite o primeiro n�mero");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo n�mero");
				y = leitura.nextFloat();
				z = x - y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " � igual a: " + z);

			} else if (opcao == 3) {
				operacao = ("Multiplica��o");
				System.out.println("Por favor, digite o primeiro n�mero");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo n�mero");
				y = leitura.nextFloat();
				z = x * y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " � igual a: " + z);

			} else if (opcao == 4) {
				operacao = ("Divis�o");
				System.out.println("Por favor, digite o primeiro n�mero");
				x = leitura.nextFloat();
				System.out.println("Agora o segundo n�mero");
				y = leitura.nextFloat();
				z = x / y;
				System.out.println("A " + operacao + " de " + x + " por " + y + " � igual a: " + z);
			} else if (opcao == 9) {
			} else {
				System.out.println("Op��o inv�lida! Por favor, digite uma op��o correta!");

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
