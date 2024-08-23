package fundamentos;

import java.util.Scanner;
public class Console {
	public static void main(String[] args) {

		System.out.print("Bom");
		System.out.print("dia\n");
		
		System.out.println("Bom");
		System.out.println("dia");
		
		System.out.printf("Megasena: %d %d %d %d %d %d %n", 1,2,3,4,5,6);
		
		System.out.printf("Sálario: %.1f %n", 1234.5678);
		System.out.printf("Nome: %s %n", "João" );
		
		//int a = 3;
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Digite o seu nome: ");
		String nome = entrada.nextLine();
		
		System.out.println("Digite seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		
		System.out.println("Digite sua idade: ");
		int idade = entrada.nextInt();
		
		System.out.println("Nome = " + nome.toUpperCase());
		System.out.println("Sobrenome = " + sobrenome.toUpperCase());
		System.out.println("Idade = " + idade);
		System.out.printf("%s %s tem %d anos de idade", nome, sobrenome, idade);
		
		entrada.close();
	}
}
