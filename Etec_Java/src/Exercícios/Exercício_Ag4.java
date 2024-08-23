package Exercícios;

import java.util.Scanner;

public class Exercício_Ag4{
	public static void main(String[] args) {
		
		 //Declaração das variaveis
        String modelo_carro;
        double valor_diaria;
        int dias_locacao;
        double km_percorrido;
        // Para a leitura dos dados coloquei um Scanner 
        Scanner entrada = new Scanner(System.in);
        
        // Início do programa
        System.out.println("Digite o modelo do carro:"); 
        modelo_carro = entrada.nextLine(); 
        // leitura do modelo do carro
        
        System.out.println("Digite o valor da diária:");
        valor_diaria = entrada.nextDouble(); 
        // leitura do valor da diária
        
        System.out.println("Digite por quantos dias o carro foi uzado:");
        dias_locacao = entrada.nextInt(); 
        // leitura do modelo dos dias de locação
        
        System.out.println("Digite quantos Km o carro rodou:");
        km_percorrido = entrada.nextDouble(); 
        // leitura do modelo dos Km rodados
        
        double total_pagar = (valor_diaria * dias_locacao) + (km_percorrido * 0.20); 
        // Cálculo para ter o valor total
        System.out.printf("O total a pagar pela utilização do " + modelo_carro + 
                " será de R$" + total_pagar);
        // Saída dos Dados do programa
        
        entrada.close(); // Saída do Scanner
    }
}

