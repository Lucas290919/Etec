package Exercícios;

public class Desafio_Temperatura {
	public static void main(String[] args) {
		
		// (f - 32)  x 5/9 = °C
		final double fator = 5.0 / 9.0;
		final double x = 32;
		double f = 192;
		double celcius = (f - x) * fator;
		System.out.println("A temperatura tranformada será de "+celcius + "°C");
		
		f = 86;
		celcius = (f - x) * fator;
		System.out.println("A temperatura tranformada será de "+celcius + "°C");
		
	}
}
