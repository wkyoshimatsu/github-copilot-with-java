package me.wky.github_copilot_with_java;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Scanner;

@SpringBootApplication
public class GithubCopilotWithJavaApplication {

	public static void main(String[] args) {
		SpringApplication.run(GithubCopilotWithJavaApplication.class, args);
	}

	@Bean
	public CommandLineRunner run() {
		return args -> {
			Scanner scanner = new Scanner(System.in);
			System.out.println("Escolha o módulo (1-6):");
			int escolha = scanner.nextInt();
			scanner.nextLine(); // Consumir quebra de linha

			switch (escolha) {
				case 1 -> concatenacaoDados(scanner);
				case 2 -> repeticaoTextos(scanner);
				case 3 -> operacoesMatematicas(scanner);
				case 4 -> verificacaoParImpar(scanner);
				case 5 -> calculoMedia(scanner);
				case 6 -> verificacaoPalindromo(scanner);
				default -> System.out.println("Opção inválida.");
			}
		};
	}

	private void concatenacaoDados(Scanner scanner) {
		System.out.println("Digite o primeiro dado:");
		String dado1 = scanner.nextLine();
		System.out.println("Digite o segundo dado:");
		String dado2 = scanner.nextLine();
		System.out.println("Resultado: " + dado1 + dado2);
	}

	private void repeticaoTextos(Scanner scanner) {
		System.out.println("Digite uma string:");
		String texto = scanner.nextLine();
		System.out.println("Digite um número:");
		int vezes = scanner.nextInt();
		for (int i = 0; i < vezes; i++) {
			System.out.println(texto);
		}
	}

	private void operacoesMatematicas(Scanner scanner) {
		System.out.println("Digite o primeiro número:");
		double num1 = scanner.nextDouble();
		System.out.println("Digite o segundo número:");
		double num2 = scanner.nextDouble();
		System.out.println("Escolha a operação (+, -, *, /):");
		char operacao = scanner.next().charAt(0);

		double resultado;
		switch (operacao) {
			case '+' -> resultado = num1 + num2;
			case '-' -> resultado = num1 - num2;
			case '*' -> resultado = num1 * num2;
			case '/' -> resultado = num1 / num2;
			default -> {
				System.out.println("Operação inválida.");
				return;
			}
		}
		System.out.println("Resultado: " + resultado);
	}

	private void verificacaoParImpar(Scanner scanner) {
		System.out.println("Digite um número inteiro:");
		int numero = scanner.nextInt();
		if (numero % 2 == 0) {
			System.out.println("O número é par.");
		} else {
			System.out.println("O número é ímpar.");
		}
	}

	private void calculoMedia(Scanner scanner) {
		System.out.println("Digite a primeira nota:");
		double nota1 = scanner.nextDouble();
		System.out.println("Digite a segunda nota:");
		double nota2 = scanner.nextDouble();
		System.out.println("Digite a terceira nota:");
		double nota3 = scanner.nextDouble();
		double media = (nota1 + nota2 + nota3) / 3;
		System.out.println("Média: " + media);
	}

	private void verificacaoPalindromo(Scanner scanner) {
		System.out.println("Digite uma palavra:");
		String palavra = scanner.nextLine();
		String invertida = new StringBuilder(palavra).reverse().toString();
		if (palavra.equalsIgnoreCase(invertida)) {
			System.out.println("É um palíndromo.");
		} else {
			System.out.println("Não é um palíndromo.");
		}
	}
}
