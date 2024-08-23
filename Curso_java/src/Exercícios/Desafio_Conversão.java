package Exercícios;

import java.util.Scanner;

public class Desafio_Conversão {
	public static void main(String[] args) {

		Scanner entrada = new Scanner(System.in);

		System.out.println("Digite o primeiro salário:");
		String valor1 = entrada.nextLine().replace("," ,".");


		System.out.println("Digite o segundo salário:");
		String valor2 = entrada.nextLine().replace("," ,".");

		System.out.println("Digite o terceiro salário:");
		String valor3 = entrada.nextLine().replace("," ,".");

		double salario1 = Double.parseDouble(valor1);
		double salario2 = Double.parseDouble(valor2);
		double salario3 = Double.parseDouble(valor3);

		System.out.printf("Salário 1: %s %nSalário 2: %s %nSalário 3: %s", salario1, salario2, salario3);

		double soma = salario1 + salario2 + salario3;
		System.out.println("\nA soma dos salários é de: " + soma);
		
		double média = soma / 3;
		System.out.println("A média é de: " + média);
		
		entrada.close();

	}
}
