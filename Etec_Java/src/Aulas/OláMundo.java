package Aulas;

import java.util.Scanner;

public class OláMundo {
	public static void main(String[] args) {
		
		System.out.println(((7+3)+3)*2);
		System.out.println(168 / 46);
		System.out.println((7%4) * 2);
		System.out.println("Técnico" + "Módulo" + "1");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite seu nome:");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome:");
		String sobrenome = entrada.nextLine();
		
		System.err.println("Seu sobrenome é " + sobrenome + " e seu nome " + nome);
		
		System.out.println("Digite um número inteiro: ");
		int numero1 = entrada.nextInt();
		
		System.out.println("Digite outro numero inteiro: ");
		int numero2 = entrada.nextInt();
		
		int mult = numero1 * numero2;
		System.out.println("A multiplicação desses números informados é: " + mult);
		
		entrada.close();
		
	}
}
